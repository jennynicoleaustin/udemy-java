public class Main {
    public static void main(String[] args) {

        // the new keyword initializes the variable - the object must be initialized.
        Car toyota = new Car();
            // created a Car object called Camry based on the template defined by the Car class
        // new keyword is actually a constructor saying "create this object
        Car honda = new Car();
        // access the methods we have created
        honda.setModel("civic");
        System.out.println("Model is " + honda.getModel());
        // by creating the car class we have gained access to functionalities (Methods) within Java "the car class has inherited methods from the base class of java

        // the variables assigned with private access will not be available in the .methods of the class, however those given the access value, public are available
        // default value for a variable that has not yet been assigned a value is null

        //

// Constructors are a way to set all the initial values of your method quickly
        // can be overloaded as long as you change the number of parameters

        Car subaru = new Car(4, 4, "Outback", "four cylinder", "blue");


    } // main closer
} // class closer