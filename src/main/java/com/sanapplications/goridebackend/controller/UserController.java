package com.sanapplications.goridebackend.controller;

import com.sanapplications.goridebackend.service.UserService;
import com.sanapplications.goridebackend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping("getUserById")
    public UserModel getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @PostMapping("getUserByPhone")
    public UserModel getUserByPhone(@RequestParam String phone){
        return userService.getUserByPhone(phone);
    }

    @PostMapping("addUser")
    public UserModel addUser(@RequestBody UserModel userModel){
         return userService.addUser(userModel);
    }

    @DeleteMapping("deleteUser/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("updateUser/{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        userService.updateUser(userId, name, email);
    }

    @PutMapping("updateUserName/{userId}")
    public void updateUserName(
            @PathVariable("userId") Long userId,
            @RequestParam String email){
        userService.updateUserEmail(userId, email);
    }

    @PutMapping("updateUserFirstName/{userId}")
    public void updateUserFirstName(
            @PathVariable("userId") Long userId,
            @RequestParam String firstName){
        userService.updateUserFirstName(userId, firstName);
    }

    @PutMapping("updateUserLastName/{userId}")
    public void updateUserLastName(
            @PathVariable("userId") Long userId,
            @RequestParam String firstName){
        userService.updateUserLastName(userId, firstName);
    }

    @PutMapping("updateUserRoute/{userId}")
    public void updateUserRoute(
            @PathVariable("userId") Long userId,
            @RequestParam String Route){
        userService.updateUserRoute(userId, Route);
    }

    @PostMapping("isUserExist")
    public boolean isUserExist(@RequestParam String userPhone) {
       return userService.isUserExist(userPhone);
    }
    

    @PostMapping("login")
    public boolean login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }

    @PostMapping("register")
    public UserModel register(@RequestParam String email,
                              @RequestParam String password,
                              @RequestParam String phone,
                              @RequestParam String firstName,
                              @RequestParam String lastName) {
        return userService.register(email, password, phone, firstName, lastName);
    }
}
