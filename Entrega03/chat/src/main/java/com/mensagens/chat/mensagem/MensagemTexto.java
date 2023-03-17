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
public class MensagemTexto extends Mensagem{
    String texto;
    public MensagemTexto(User autor, String texto){
        super(autor);
        this.texto = texto;
    }

}
