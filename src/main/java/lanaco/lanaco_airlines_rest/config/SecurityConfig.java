package lanaco.lanaco_airlines_rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests((authorizeRequests) ->
                        authorizeRequests.requestMatchers(HttpMethod.POST, "/api/login").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/register").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/reservation").authenticated()
                                .requestMatchers(HttpMethod.GET, "/api/search").authenticated()

                ).csrf(csrf -> csrf.disable())
                .httpBasic(withDefaults())
                .formLogin(withDefaults());
        return httpSecurity.build();
    }
}
