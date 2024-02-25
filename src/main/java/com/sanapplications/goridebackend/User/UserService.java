package com.sanapplications.goridebackend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(UserModel userModel) {
        Optional<UserModel> userByEmail = userRepository.findUserByEmail(userModel.getEmail());
        if(userByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        userRepository.save(userModel);
        System.out.println(userModel);
    }

}
