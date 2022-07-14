package com.demo.simpleapp.jwt;

import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.business.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TokenServiceImpl implements TokenService {


    private final JwtUserDetailsService userDetailsService;

    private final AuthenticationManager authenticationManager;

    private final TokenManager tokenManager;


    public String generate(String username){
        return tokenManager.generateJwtToken(username);
    }

    public String getUsername(LoginRequest credentials){
        final UserDetails userDetails = userDetailsService.loadUserByUsername(credentials.getEmail());
        return userDetails.getUsername();
    }

    public void authenticate(LoginRequest credentials) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            credentials.getEmail(),
                            credentials.getPassword()
                    )
            );
        } catch (DisabledException e) {
            throw new RuntimeException("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new RuntimeException("INVALID_CREDENTIALS", e);
        }
    }

}
