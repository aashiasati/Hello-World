// Student Grade Calculator
// Author: Aashi Asati
// Hacktoberfest 2025

import java.util.Scanner;

public class StudentGradeCalculator {

    // Function to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator!");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks obtained (out of 100): ");
        double marks = sc.nextDouble();

        String grade = calculateGrade(marks);
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
