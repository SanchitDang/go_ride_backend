package com.sanapplications.goridebackend.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "sanchit@outlook.com",
                        "12345678",
                        "8810625561",
                        "Sanchit",
                        "Dang"
                )
        );
    }

}
