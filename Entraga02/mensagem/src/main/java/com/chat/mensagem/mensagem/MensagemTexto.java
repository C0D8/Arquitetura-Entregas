package com.chat.mensagem.mensagem;

import com.chat.mensagem.user.User;

public class
MensagemTexto extends Mensagem{

    String texto;
    public MensagemTexto(User autor, String texto){
        super(autor);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
