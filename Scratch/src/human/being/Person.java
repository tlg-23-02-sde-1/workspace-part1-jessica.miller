package human.being;

import java.time.LocalDate;
import java.time.Period;

/*
* An immutable class. More accurately, this is
* a class definition written in such a way
* that instances of it ( person objects) cannot
* have their properties changed once created. In short
* getters but no public setters. THEY ARE NOT HARD TO WRITE!!!!
* */
class Person {
    private String name;
    private LocalDate birthDate;

    //constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //accessor method
    /*
    * returns the person's age in whole years
    * This can be derived from the birthDate and today's date.
    * you need to get the period of time in whole years between
    * the birthdate and today's date.
    * */
    public int getAge() {
        Period period = Period.between(getBirthDate(), LocalDate.now());
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    public String toString() {
        return String.format("human.being.Person: name=%s, birthdate=%s", getName(), getBirthDate());
    }
}