package com.firstapp.firstapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity //for JPA storage
@Table( name = "animal") //arata ca isi ia valorile din tabela animal
@Data //create all getters, setters, equals, hash, toString
public class Animal {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //random value
    private Long id;
    @Column ( name = "nume") // o sa il ia din coloana nume
    private String name;
    @Column (name = "owner_name") //o sa il ia din coloana owner_name
    private String ownerName;

}
