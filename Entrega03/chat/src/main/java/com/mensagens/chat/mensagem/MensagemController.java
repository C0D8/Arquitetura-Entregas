package com.mensagens.chat.mensagem;

import com.mensagens.chat.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;
    @Autowired
    private UserService userService;


    @GetMapping
    public List<Mensagem> getMensagems(){
        return mensagemService.getMensagems();
    }


    @GetMapping("/{id}")
    public Mensagem getMensagem(@PathVariable String id){
        return mensagemService.getMensagem(id);

    }

    @GetMapping("/{userId}/user")
    public List<Mensagem> getMensagensUser(@PathVariable String userId){
        return mensagemService.mensagemsUser(userId);
    }

    @PostMapping("/mensagemText")
    public Mensagem criarMensagemTexto(@RequestBody MensagemTexto mensagemTexto){
        if(userService.getUser(mensagemTexto.getAutor().getIdentifier()) != null){
            return mensagemService.criaMensagem(mensagemTexto);
        }

        return null;
    }
    @PostMapping("/mensagemFile")
    public Mensagem criarMensagemFile(@RequestBody MensagemFile mensagemFile){

        if(userService.getUser(mensagemFile.getAutor().getIdentifier()) != null){
            return mensagemService.criaMensagem(mensagemFile);
        }

        return null;
    }

}

