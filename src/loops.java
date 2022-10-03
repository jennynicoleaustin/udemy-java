public class loops {

    public static void main(String[] args) {
        System.out.println(calculateInterest(100000.0, 2.0));

        //Syntax for for loop
       // for(init; termination; increment) {
            // init - the initial value
            // termination - value which loop should stop running
            // increment - amount the loop should increment by each time.
//        };
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    // For loop to calculate multiple interest rates with a given value

    public static double calculateInterestLoop() {

    }
}
