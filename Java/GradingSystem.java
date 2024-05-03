/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author vince
 */
public class GradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
//        Prompt user to enter the subject
        System.out.println("Enter the subject (Other than Math)");
        String subject = scanner.nextLine();
        System.out.println("Enter the grade: ");
        int grade = scanner.nextInt();
        scanner.close();
        String description = gradeDescription(subject, grade);
        System.out.println(description);
    }
    
//    Validating subjects and grade range
    public static String gradeDescription(String subject, int grade) {
//        Check if the subject is Math
        if (!subject.equals("Math")){
//            Grade range conditions
            if (grade > 90) {
                return "Grade A";
            } else if (grade >= 81 && grade <= 90) {
                return "Grade B";
            } else if (grade >= 71 && grade <= 80) {
                return "Grade C";
            } else if (grade >= 50 && grade <= 70) {
                return "Grade D";
            } else if (grade < 50) {
                return "Grade E";
            } else {
                return "Invalid grade input";
            }
        } else {
            return "This is the Math Subject.";
        }
    }
}
