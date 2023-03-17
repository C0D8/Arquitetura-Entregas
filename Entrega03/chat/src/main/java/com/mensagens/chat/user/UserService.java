package com.mensagens.chat.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String idenfier){


        return userRepository.findByIdentifier(idenfier);
    }



    public User criarUser(User user){


        user.setIdentifier(UUID.randomUUID().toString());

        userRepository.save(user);
        return user;
    }





}
