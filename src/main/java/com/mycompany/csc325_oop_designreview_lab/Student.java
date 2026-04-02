/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Fransisco Payes
 */
public class Student extends Human {
    private String address;
    private double gpa;

    /**
     *
     * Student class that extends human
     * Represents a student with gpa and address
     */
    public Student(String name, short age, String address, double gpa ){
        super(name,age); // call parent constructor
        this.address = address;
        this.gpa = gpa;
    }
    /**
     *
     * Returns student's address
     */
    @Override
    public String getAddress(){
        return address;
    }

    /**
     *
     * Sets student's address
     */
    @Override
    public void setAddress(String address){
        this.address = address;
    }
    /**
     *
     * Sets student's gpa
     */
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    /**
     *
     * Gets student's gpa
     */
    public double getGpa(){
        return gpa;
    }

}
