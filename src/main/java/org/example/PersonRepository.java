package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//Schritt 4: Erstelle eine Klasse PersonRepository mit einer Liste/Map von Personen.
public class PersonRepository {
    Map <String, Person> persons = new HashMap<>();

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    //Schritt 5: Schreibe eine Methode in der Klasse PersonRepository, die eine Person anhand ihrer Id aus der Liste/Map sucht und zurückgibt. Die Methode soll ein Optional zurückgeben.
    public Optional<Person> getPersonInformations(String id){
        if(persons.containsKey(id)){
            return Optional.ofNullable(persons.get(id));
        }
        else
        {
            return Optional.empty();
        }
    }

    //Schreibe eine Methode im PersonRepository, die die Anzahl der Personen nach Geschlecht zählt und die Ergebnisse ausgibt.
    public void numberOfPeopleByGender(){
        int maleNumber = 0;
        int femaleNumber = 0;
        int diverseNumber = 0;
        for(Person person : persons.values()){
            if(person.gender() == Gender.MALE){
                 maleNumber +=1;
            } else if (person.gender() == Gender.FEMALE) {
                 femaleNumber +=1;
            }
            else {
                diverseNumber +=1;
            }
        }
        System.out.println( " ** " + "the male Number is: " + maleNumber + " ** " + "the female number is: " + femaleNumber + " ** " + "the diverse number is: " + diverseNumber + " ** " );
    }
}
