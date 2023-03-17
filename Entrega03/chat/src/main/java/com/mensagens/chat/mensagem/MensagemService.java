package com.mensagens.chat.mensagem;

import com.mensagens.chat.user.User;
import com.mensagens.chat.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class MensagemService {



    @Autowired
    private MensagemRepository mensagemRepository;


    @Autowired
    private UserService userService;



    public List<Mensagem> getMensagems(){
        return mensagemRepository.findAll();
    }
    public Mensagem getMensagem(String identifier){

                return mensagemRepository.findByIdentifier(identifier);
            }

    public Mensagem criaMensagem(Mensagem mensagem){

        mensagem.setIdentifier(UUID.randomUUID().toString());

        return mensagemRepository.save(mensagem);
    }

    public List<Mensagem> mensagemsUser(String identifier){

        User user = userService.getUser(identifier);

        return user.getMensagensUser();


    }
}
