/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradereport;

import java.util.Scanner;

/**
 *
 * @author Anenmisrak
 */
public class GradeReport {

    private static Scanner scanner;
    private static int i;
    private static float number,percentage,totalMarks;
   

/**
 * Java Program to print grade of a student
 */
    public static void main(String[] args) {

       grade();
    }

    private static void grade() {
       Scanner scanner;
        scanner = new Scanner(System.in);
         System.out.println("Enter Marks of 5 Subject");
         number = scanner.nextFloat();
        for (i = 0; i < 4; i++) {
        
            if(number > 100){
                System.out.println("The number must be less than 100");
                grade();
            }
            else if(number < 0){
                System.out.println("The number must be greter than 0");
                grade();
            }
            else{
            totalMarks += scanner.nextInt();
            }
           
        }
        System.out.println("Total Marks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (5 * 100)) * 100;
        System.out.println("The Percentage is :" + percentage);

        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}
  
    
