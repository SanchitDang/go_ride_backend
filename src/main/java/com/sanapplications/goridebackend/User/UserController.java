package com.sanapplications.goridebackend.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getUsers")
    public List<UserModel> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("addUser")
    public void addUser(@RequestBody UserModel userModel){
        userService.addUser(userModel);
    }
}
