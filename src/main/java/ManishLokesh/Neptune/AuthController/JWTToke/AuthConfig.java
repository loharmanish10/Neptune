package ManishLokesh.Neptune.AuthController.JWTToke;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthConfig {

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }
}
