package com.sanapplications.goridebackend.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            UserModel sanchit = new UserModel(
                    "sanchit@outlook.com",
                    "12345678",
                    "8810625561",
                    "Sanchit",
                    "Dang"
            );
            UserModel paras = new UserModel(
                    "paras@outlook.com",
                    "12345678",
                    "8976787876",
                    "Paras",
                    "Kaushik"
            );
            repository.saveAll(
                    List.of(sanchit, paras)
            );
        };
    }

}
