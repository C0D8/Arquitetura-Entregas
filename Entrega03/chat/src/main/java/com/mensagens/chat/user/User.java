package com.mensagens.chat.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mensagens.chat.mensagem.Mensagem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;





@Entity(name = "usuario")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public User(){
    }

    private String nome;
    private String identifier ;
    public User(String nome){
        this.nome = nome;

    }

    @OneToMany(mappedBy = "autor")
    @JsonIgnore
    public List<Mensagem> mensagensUser = new ArrayList<>();


}

