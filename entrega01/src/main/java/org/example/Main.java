package org.example;

import org.example.mensagem.MensagemFile;
import org.example.mensagem.MensagemTexto;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        User user = new User("code");
        MensagemTexto mensagemTexto = new MensagemTexto(user, "Isso é uma mensagem de texto.");
        User user2 = new User ("Gustavo");
        MensagemFile mensagemFile = new MensagemFile(user2, "Esse é o meu arquivo desktop/user/img.png");

        System.out.println(mensagemFile.getAutor().getNome() + "  :" + mensagemFile.getPath());
        System.out.println(mensagemTexto.getAutor().getNome() + "  :" + mensagemTexto.getConteudo());


    }


}