package com.demo.simpleapp.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import java.io.Serializable;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class TokenManager implements Serializable {

    @Value("${TIME_TO_EXPIRE_IN_MINUTES}")
    private Integer TIME_TO_EXPIRE_IN_MINUTES;
    @Value("${JWT_SECRET}")
    private String JWT_SECRET;


    public String generateJwtToken(String username) {
        LocalDateTime currentTime = LocalDateTime.now();
        Date now = Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant());
        Date future = Date.from(currentTime.plusMinutes(TIME_TO_EXPIRE_IN_MINUTES).atZone(ZoneId.systemDefault()).toInstant());

        Map<String, Object> claims = new HashMap<>();
        claims.put("exp", future.getTime());

        byte[] apiKeySecretBytes = Base64.getEncoder().encode(JWT_SECRET.getBytes());
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());

        return Jwts.builder().setClaims(claims).setSubject(username)
                .setIssuedAt(now)
                .setExpiration(future)
                .signWith(signingKey, SignatureAlgorithm.HS256).compact();
    }

    public Boolean validateJwtToken(String token, String username) {
        String usernameFromToken = getUsernameFromToken(token);
        byte[] apiKeySecretBytes = Base64.getEncoder().encode(JWT_SECRET.getBytes());
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(apiKeySecretBytes)
                .build()
                .parseClaimsJws(token).getBody();
        boolean isTokenExpired = claims.getExpiration().before(new Date());
        return (usernameFromToken.equals(username) && !isTokenExpired);
    }

    public String getUsernameFromToken(String token) {
        byte[] apiKeySecretBytes = Base64.getEncoder().encode(JWT_SECRET.getBytes());
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(apiKeySecretBytes)
                .build()
                .parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
}