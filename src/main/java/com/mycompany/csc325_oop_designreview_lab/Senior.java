package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, String address, double gpa, int credits) {
        super(name, age, address, gpa);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior: " + getName() + ", Age: " + getAge() +
                ", Credits: " + credits + ", GPA: " + getGpa();
    }
}
