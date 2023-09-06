package org.example;

//Schritt 1: Erstelle ein Enum DaysOfWeek mit den Wochentagen (Montag bis Sonntag).
public enum DaysOfWeek {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);


    private final boolean isWorkDay;

    DaysOfWeek(boolean isWorkDay) {
        this.isWorkDay = isWorkDay;
    }

    public boolean isWorkDay() {
        return isWorkDay;
    }

    //Schritt 2: Schreibe eine Methode, die den übergebenen Wochentag als String zurückgibt, wenn er ein Werktag (Montag bis Freitag) ist, andernfalls gib 'Wochenende' zurück.
    public String isWorkDay(DaysOfWeek day){
        if(day.isWorkDay()){
           return  day.toString();
        }
        else {
           return "Weekend";
        }
    }
}
