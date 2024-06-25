package br.upe.devDojo.service;

import br.upe.devDojo.Person.Person;

import java.util.Objects;

public class PersonService {

    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person cant be null");
        return person.getAge() >= 18;

    }


}
