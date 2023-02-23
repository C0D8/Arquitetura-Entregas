package org.example.mensagem;

import org.example.user.User;

public class MensagemTexto extends Mensagem{

    private String conteudo ;
    public MensagemTexto(User autor, String conteudo){
        super(autor);
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
