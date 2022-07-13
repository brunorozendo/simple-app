package com.demo.simpleapp.jwt;

import com.demo.simpleapp.api.v3.controller.Merchant;
import com.demo.simpleapp.api.v3.controller.dto.LoginRequest;
import com.demo.simpleapp.api.v3.controller.dto.LoginResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class JwtController implements Merchant {

    private final JwtUserDetailsService userDetailsService;

    private final AuthenticationManager authenticationManager;

    private final TokenManager tokenManager;


    @Override
    public LoginResponse getCredentials(LoginRequest credentials) {
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
        final UserDetails userDetails = userDetailsService.loadUserByUsername(credentials.getEmail());
        final String jwtToken = tokenManager.generateJwtToken(userDetails);
        LoginResponse response = new LoginResponse();
        response.setToken(jwtToken);
        response.setStatus("APPROVED");
        return response;
    }
}