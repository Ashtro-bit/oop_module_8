/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author Fransisco Payes
 */
public class MainClass {

 public static void main(String[] args) {


     //Student std1= new Student("James", 20);

     Scanner scanner = new Scanner(System.in);

     // Create Freshman
     Freshman std1 = new Freshman("James", (short)20, "NY", 0.0, 12);

     // Create Senior
     Senior std2 = new Senior("John", (short)30, "CA", 0.0, 90);


     // User input GPA
     System.out.print("Enter GPA for Freshman: ");
     double gpa1 = scanner.nextDouble();
     std1.setGpa(gpa1);

     System.out.print("Enter GPA for Senior: ");
     double gpa2 = scanner.nextDouble();
     std2.setGpa(gpa2);

		System.out.println(std1);

        System.out.println(std2);



	}

}

