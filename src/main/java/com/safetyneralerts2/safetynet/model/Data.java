package com.safetyneralerts2.safetynet.model;


import java.util.List;

public class Data {
    private List<Person> persons;

    public Data(List<Person> persons) {
        // Constructeur par défaut
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    // Autres méthodes de la classe Data
}
