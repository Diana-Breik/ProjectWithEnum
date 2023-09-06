package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //wir prüfen, ob ein Tag Werktag ist. Wenn er Werktag ist, dann kriegen wir true.
        // System.out.println(DaysOfWeek.SUNDAY.isWorkDay());

        //Schritt 6: überprüft in euerer Main-Methode, ob es die Person gibt. Wenn es sie gibt, dann gib den Namen und den Lieblings-Wochentag auf der Konsole aus.
        Person person1 = new Person("1","Sandra",DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person person2 = new Person("2","Sam",DaysOfWeek.SATURDAY, Gender.MALE);
        Person person3 = new Person("3","Jan",DaysOfWeek.WEDNESDAY,Gender.MALE);

        Map <String,Person> map = new HashMap<>();
        map.put(person1.id(),person1);
        map.put(person2.id(),person2);
        map.put(person3.id(),person3);

        PersonRepository personRepository = new PersonRepository(map);
        System.out.println(personRepository.getPersonInformations("1"));//diese person ist in dem Map
        System.out.println(personRepository.getPersonInformations("6"));//diese person ist nicht in dem Map


        System.out.println("-------------Bonusaufgaben-------------");
        personRepository.numberOfPeopleByGender();
    }

}