package com.chat.mensagem.mensagem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MensagemService {

    List<Mensagem> mensagems = new ArrayList<>();


    public List<Mensagem> getMensagems(){
        return mensagems;
    }
    public Mensagem getMensagem(String id){
        for(Mensagem mensagem : mensagems){
            if(mensagem.getId().equals(id)){
                return mensagem;
            }
        }
        return null;
    }

    public Mensagem criaMensagem(Mensagem mensagem){
        mensagems.add(mensagem);
        return mensagem;
    }

    public List<Mensagem> mensagemsUser(String id){

        List<Mensagem> l = new ArrayList<>();

        for(Mensagem mensagem : mensagems) {
            if (mensagem.getAutor().getId().equals(id)) {

                l.add(mensagem);
            }

        }
        return l;

    }

}

