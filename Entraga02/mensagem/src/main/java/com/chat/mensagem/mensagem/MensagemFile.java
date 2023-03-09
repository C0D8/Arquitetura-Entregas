package com.chat.mensagem.mensagem;

import com.chat.mensagem.user.User;

public class MensagemFile extends Mensagem{

    String path;
    public MensagemFile(User autor, String path){
        super(autor);
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
