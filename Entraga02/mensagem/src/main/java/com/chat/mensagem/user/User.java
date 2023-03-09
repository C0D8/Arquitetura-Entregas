package com.chat.mensagem.user;

import java.util.UUID;

public class User {


    public User(){

    }

    private String nome;
    private String id = UUID.randomUUID().toString();
    public User(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
