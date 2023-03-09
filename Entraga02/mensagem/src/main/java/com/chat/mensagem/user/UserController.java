package com.chat.mensagem.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){

        return userService.getUser(id);

    }

    @PostMapping
    public User criarUser(@RequestBody User user){
        return userService.criarUser(user);
    }
}
