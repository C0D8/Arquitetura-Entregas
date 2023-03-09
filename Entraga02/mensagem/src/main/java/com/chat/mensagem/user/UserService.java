package com.chat.mensagem.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

private List<User> users  = new ArrayList<>();


public List<User> getUsers(){
return users;
}

public User getUser(String id){

    for(User user: users){
        if(user.getId().equals(id)){
            return user;
        }
    }
    return null;
}



public User criarUser(User user){


    users.add(user);
    return user;
}






}
