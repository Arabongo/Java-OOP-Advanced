package JAVAO._5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
//        Files.createFile(Path.of("Test.txt"));
        try {
            System.out.println("Ho creato un file");
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        String userInputFileName = "test-file.txt";
        try {
            File file = new File(userInputFileName);
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Impossibile trovare il file " + userInputFileName);
            e.printStackTrace();
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
      //  int num = Integer.parseInt(str);
      //  System.out.println("Il numero convertito è: " + num);
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException e) {
            System.out.println("La stringa non può essere convertita in un numero intero valido: ");
            e.printStackTrace();
        }
    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";
        try {
            System.out.println(num1 / Double.parseDouble(num2AsString));
        } catch (NumberFormatException e) {
            System.out.println("Non si può fare perché la stringa non ha il formato adeguato");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Non si può dividere per 0 un valore integrale o decimale");
            e.printStackTrace();
        }
    }
}
// Your catch blocks here