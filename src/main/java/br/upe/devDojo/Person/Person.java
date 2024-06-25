package br.upe.devDojo.Person;

import lombok.*;
import lombok.Data;

@Data
public class Person {
    private int age;
    public Person(int idade){
        age = idade;
    }

}
