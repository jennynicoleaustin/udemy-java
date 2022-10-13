import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    } // Main Method

// Scanner Class exceptions
    // for the catch (here) - intelliJ offers a list of exceptions to choose from - what exception do you want to handle.

    private static int getIntEAFP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

} // Main Class