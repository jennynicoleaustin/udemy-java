public class parseValuesFromString {

    public static void main(String[] args) {
        String numbersAsString = "2018";
        System.out.println("numberAsString= " + numbersAsString);
        // convert a string into a number

        int number = Integer.parseInt(numbersAsString);
        // wrapper class for the primitive type int
        System.out.println(number);

        // If the string number that you are attempting to parse includes any values that are not numbers, you will be thrown an error (exception)

        double number2 = Double.parseDouble(numbersAsString);
        System.out.println(number2);
    }
}
