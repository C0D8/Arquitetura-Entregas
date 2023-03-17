package com.mensagens.chat.mensagem;

import com.mensagens.chat.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensagemRepository extends JpaRepository<Mensagem, Integer> {


    Mensagem findByIdentifier(String identifier);


//    List<Mensagem> finfByAutor(User user);
}
