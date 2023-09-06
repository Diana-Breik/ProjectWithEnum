package org.example;

//Schritt 3: Erstelle ein Record 'Person' mit den Eigenschaften 'id', 'name' und 'favoriteDay', wobei 'favoriteDay' vom Typ DaysOfWeek ist.
public record Person( String id, String name, DaysOfWeek favoriteDay, Gender gender) {
}
