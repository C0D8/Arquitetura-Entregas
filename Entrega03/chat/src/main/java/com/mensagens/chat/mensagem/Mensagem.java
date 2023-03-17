package com.mensagens.chat.mensagem;

import com.mensagens.chat.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Mensagem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Mensagem(){}

    @ManyToOne
    @JoinColumn(name ="id_usuario")
    private User autor;
    private String identifier;

    public Mensagem(User autor) {
        this.autor = autor;

    }




}
