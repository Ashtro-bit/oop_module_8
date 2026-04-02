package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;

    public Freshman(String name, short age, String address, double gpa, int credits) {
        super(name, age, address, gpa);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshman: " + getName() + ", Age: " + getAge() +
                ", Credits: " + credits + ", GPA: " + getGpa();
    }
}