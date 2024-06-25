package br.upe.devDojo.service;

import br.upe.devDojo.Person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private Person adult;
    private Person notAdult;
    private PersonService personService;
    @BeforeEach
    void SetUp(){
        adult = new Person(18);
        notAdult = new Person(17);
        personService = new PersonService();


    }
    @Test
    @DisplayName("Uma pessoa não deve ser adulta quando a idade (age), for menor que 18")
    void isNotAdult() {
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("Uma pessoa  deve ser adulta quando a idade (age), for maior ou igual a 18")
    void isAdult() {
        assertTrue(personService.isAdult(adult));
    }

}