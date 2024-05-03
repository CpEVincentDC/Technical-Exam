/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author vince
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1; // Minimum value
        int max = 1000; // Maximum value
        int mid;
        String answer; // User response
        String higherOrLower; // Another user response
        int guessCount = 0; // added a variable to keep track of the number of guesses

        System.out.println("Give me a number between 1 and 1000");

//        Loop the function until number is guessed by "yes"
        while (true) {
            mid = (min + max) / 2;
            System.out.println("Is your number " + mid + "?");
            answer = getYesNoInput(scanner, "yes/no");
            guessCount++; // increment the guess count

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Yay! I guessed it in " + guessCount + " tries!");
                break; // exit the loop when the number is guessed
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Is your number higher or lower than " + mid + "?");
                higherOrLower = getYesNoInput(scanner, "higher/lower");
                if (higherOrLower.equalsIgnoreCase("higher")) {
                    min = mid + 1;
                } else if (higherOrLower.equalsIgnoreCase("lower")) {
                    max = mid - 1;
                }
            }
        }

        scanner.close();
    }

//         return the user's response (either "yes" or "no" and "higher" or "lower")
    private static String getYesNoInput(Scanner scanner, String prompt) {
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                return input;
            } else if (prompt.equals("higher/lower")) {
                if (input.equalsIgnoreCase("higher") || input.equalsIgnoreCase("lower")) {
                    return input;
                }
            }
            System.out.println("Invalid input. Please enter " + prompt + ".");
        }
    }
}
