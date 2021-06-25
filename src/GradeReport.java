/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Anenmisrak
 */
public class GradeReport {

         private final int GRADE_MINIMUM = 0;
    private final int GRADE_MAXIMUM = 100;
    Scanner scanner = new Scanner(System.in);
    private  static float percentage,totalMarks;
    private int[] subjects;
   

/**
 * Java Program to print grade of a student
 */
    public static void main(String[] args) {
        GradeReport gradeReport = new GradeReport();
       
        gradeReport.readGrades();
        System.out.printf("The Totla Mark is %1$.2f\n", gradeReport.totalMark());
        System.out.printf("The percentage is %1$.2f\n", gradeReport.average(totalMarks));
        System.out.printf("The Grade is %1$c\n", gradeReport.getLetterGrade(percentage));

      
    }
   private  void readGrades() {
       
          System.out.println("Enter name of the Student");
          String nameOfstudent;
         nameOfstudent = scanner.next();
          int numberOfSubjects = 5;
       
        subjects = new int[numberOfSubjects];
        int i = 0;
        while (i < numberOfSubjects)
        {
            System.out.printf("Enter the mark of Subject %1$d: ", (i+1));
            int grade = scanner.nextInt();
            if (GRADE_MINIMUM <= grade && grade <= GRADE_MAXIMUM)
            {
                subjects[i] = grade;
                totalMarks += subjects[i];
                i++;
            }
            else {
                System.out.println("Error! Grade must be between 0 and 100!");
            }
        }
        System.out.printf("Name of the student is %1$s\n",nameOfstudent);
    }
   
    public float totalMark() {
         totalMarks = subjects[0]+subjects[1]+subjects[2]+subjects[3]+subjects[4];
     return totalMarks;
  }

    public float average(float totalMarks) {
        // Each subject is of 100 Marks
        percentage = (totalMarks / (5 * 100)) * 100;
        return percentage;
    }

 
    public static char getLetterGrade(float percentage) {
       if (percentage >= 85) {
         return 'A';
      } else if (percentage >= 70) {
         return 'B';
      } else if (percentage > 50) {   // an logical error here
         return 'C';
      } 
      else if (percentage > 35) {   // an logical error here
         return 'C';
      }else {
         return 'F';
      }
    }
    
  
    
}