package com.databasepi.databasepi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(unique = true)
private String nome;
private String data;
private String cpf;
private String email;
private String telefone;
private String responsavel;

}