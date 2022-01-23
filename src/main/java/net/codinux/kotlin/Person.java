package net.codinux.kotlin;

import net.codinux.kotlin.model.Address;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;

    private final LocalDate dayOfBirth;

    private Address address;


    public Person(String name, LocalDate dayOfBirth) {
        this(name, dayOfBirth, null);
    }

    public Person(String name, LocalDate dayOfBirth, Address address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        // for people who like to write '+' and '"' :)
        return name + ": " + DateTimeFormatter.ISO_DATE.format(dayOfBirth) + " (" + address + ")";
    }

}