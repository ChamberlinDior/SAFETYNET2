package com.safetyneralerts2.safetynet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.safetyneralerts2.safetynet.model.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SafetyNetApplication {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Chemin du fichier JSON contenant les données
            File jsonFile = new File("C:\\Users\\ebaleyc\\Desktop\\safetyNet\\src\\main\\resources\\data.json");

            // Désérialisation du fichier JSON en une liste de personnes
            Data data = objectMapper.readValue(jsonFile, Data.class);
            List<Person> personList = data.getPersons();

            // Utilisation de la liste de personnes pour effectuer d'autres opérations

            // Exemple : affichage des informations des personnes
            for (Person person : personList) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
                System.out.println("Address: " + person.getAddress());
                System.out.println("Phone: " + person.getPhone());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Data {
        private List<Person> persons;

        public List<Person> getPersons() {
            return persons;
        }

        public void setPersons(List<Person> persons) {
            this.persons = persons;
        }
    }
}
