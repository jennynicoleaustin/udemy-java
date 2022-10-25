public class ExpressionExercises {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
    }
//    Speed Converter
//1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.

//If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.

//Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    public static long toMilesPerHour (double kilometersPerHour) {
        double conversionFactor = 1.609344;
        if (kilometersPerHour > 1) {
            long milesPerHour = (long) (kilometersPerHour / conversionFactor);
            System.out.println(milesPerHour);
        } return -1;
    }
}
