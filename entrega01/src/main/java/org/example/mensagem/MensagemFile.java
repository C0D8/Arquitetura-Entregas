package org.example.mensagem;

import org.example.user.User;

public class MensagemFile extends Mensagem {

    private String path ;
    public MensagemFile(User autor, String path){
        super(autor);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
