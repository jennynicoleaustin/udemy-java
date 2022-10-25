// Switch Statements :::::::

public class switchStmts {
    // if else statement in the traditional sense
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value ws 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }


        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was one");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("was not one or 2");
        }

        String month = "januAry";
        String lowercase = month.toLowerCase();
        System.out.println(lowercase);

    }
}
// differences? Switch only tests for a variable value -- if else would allow you to have multiple check types, not a value.

// Can also be used to check for a string or a part of string. strings are case sensitive.