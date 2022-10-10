// you can use the same method name by changing the number of parameters
// data type differences = java knowing that the method is unique
//  method signature... data type for parameters or number of parameters.
public class overloadingMethods {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
            double conversionFactor = 2.54;
            double feetInInches = feet * 12;
            double totalInches = feetInInches + inches;
            double converted = totalInches * conversionFactor;
        System.out.println(converted);
            return converted;
        }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
return  calcFeetAndInchesToCentimeters(feet, remainingInches);
    };
};

// More than one methods with the same name, as long as they have different parameters
// Allows us to create methods with the same name, with different implementation
// usage example, sum of 2, 3, or 4 numbers. call the methods all sum - but with different parameter options
// allows for use of the same method with different data types
