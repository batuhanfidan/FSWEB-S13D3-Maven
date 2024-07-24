package org.example;

public class Person {
    String firstName;
    String lastName;
    String city;
    String gender;
    double salary;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
    }

    public Person(String firstName, String lastName, String city,  String gender, int age, double salary) {
        this(firstName,lastName,age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
