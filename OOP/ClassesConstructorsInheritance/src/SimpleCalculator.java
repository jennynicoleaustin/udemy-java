// Well done, your solution is correct!

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber () {
        return firstNumber;
    }

    public double getSecondNumber () {
        return secondNumber;
    }

    public void setFirstNumber (double firstNumberField) {
        firstNumber = firstNumberField;
    }

    public void setSecondNumber (double secondNumberField) {
        secondNumber = secondNumberField;
    }

    public double getAdditionResult () {
        double res = firstNumber + secondNumber;
        return res;
    }

    public double getSubtractionResult () {
        double res = firstNumber - secondNumber;
        return res;
    }

    public double getMultiplicationResult () {
        double res = firstNumber * secondNumber;
        return res;
    }

    public double getDivisionResult () {
        if (secondNumber != 0) {
            double res = firstNumber / secondNumber;
            return res;
        } else {
            return 0;
        }
    }
}
