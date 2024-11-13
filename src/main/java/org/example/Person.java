package org.example;

//person
public class Person {
    String firstName;
    String lastName;
    int age;
    String homeTown;
    String footballTeam;
    int favNumber;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
        //chaining
    public Person(String firstName, String lastName, int age, String homeTown, String footballTeam, int favNumber) {
        this(firstName, lastName, age);
        this.homeTown = homeTown;
        this.footballTeam = footballTeam;
        this.favNumber = favNumber;
    }
        //getter method
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

        //check if person is teenager
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}

