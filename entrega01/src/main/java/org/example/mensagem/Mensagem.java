package org.example.mensagem;

import org.example.user.User;

public abstract class Mensagem {

    private User autor ;

//    public Mensagem(){}
    public Mensagem (User autor){
        this.autor = autor;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }
}
