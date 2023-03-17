package com.mensagens.chat.mensagem;

import com.mensagens.chat.user.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MensagemFile extends Mensagem{


    String path;
    public MensagemFile(User autor, String path){
        super(autor);
        this.path = path;
    }

}
