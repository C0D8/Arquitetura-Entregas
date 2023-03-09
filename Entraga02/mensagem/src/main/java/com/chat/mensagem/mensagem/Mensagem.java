package com.chat.mensagem.mensagem;

import com.chat.mensagem.MensagemApplication;
import com.chat.mensagem.user.User;

import java.util.UUID;

public abstract class Mensagem {

    public Mensagem(){}
    private User autor;
    private String id = UUID.randomUUID().toString();

    public Mensagem(User autor) {
        this.autor = autor;

    }

    public User getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }
}
