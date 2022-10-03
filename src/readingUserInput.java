//scanner class - primitive type scanner that can parse ints and strings
// using methods like pasrseInt internally
//.next allows you to return the inputted value to a variable

import java.util.Scanner;

public class readingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // system.in = allows you to type inputs into the console which is returned to the program.
        //new = instance of scanner; creates a new object of scanner type
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // this checks to see if the next value is an integer, returns true is so, false if it is not an int

        if (hasNextInt) { // if hasNextInt value = false the code will not run and the method will skip to the else statement
            int yearOfBirth = scanner.nextInt(); // method that takes the next int value, converts it into an int and assigns it to the variable
            // Whenever you call .nextInt, you should then call nextLine withOUT assigning it to a variable. otherwise the system will run pass the nextline, when you hit enter after typing the integer
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); //scanner.nextLine() -- sets the value inputted to the next line to the variable "name"
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 120) { // you can nest if statements
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid birth year");
            }
        } else {
            System.out.println("Unable to parse birth year");
        }

        scanner.close(); // must close the scanner after you are done using it to free up the underlying memory
    }
}

// problems with the scanner class and solutions
// negative number for a year of birth? -- add a condition that checks if the age is within a range.
// letters instead of numbers for year of birth