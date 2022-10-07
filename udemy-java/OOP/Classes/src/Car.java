// Object-Oriented Programming
// Objects = state & behavior
// Software objects: state is stored in variables while methods are the behavior.
// class = template or blueprint for creating objects
// allows you to create a data type that is "beefed up" when compared to primitive data types

//Class naming conventions - first letter of the class name should be uppercase
//Create a class = public class NameOfClass

//public keyword refers to the access rights of the class, public being unrestricted access to the class
// private = no other class can access that class.
// within the class you will define variables that are known as fields, these (unlike variables created within a method can be accessed outside the class.
// Whats the point of encapsulation??
    // doing so allows you to set all the rules and requirements for each field within the class, this means it won't assign values that an invalid, which essentially keeps errors due to invalid, type, not fitting parameters, etc, from happening

public class Car {
    // variables within a new class are usually given the access modifier private -- this adheres to the encapsulation rule in OOP
    // private access (for fields) means that the internal representation of an object is hidden from view when outside the object's definition.
            // the variables defined within this class are local variables that cannot be accessed outside the class.
                // By defining the access modifier before declaring the type and variable you are declaring this a class fields -- can be accessed outside the class
    private int doors; // characteristics of a car (states of the class - defined as fields)
    private int wheels;
    private String model;
    private String engine;
    private String color;
    // after defining the states or characteristics of the class (car) we must create an object -- head to main src

//    Java automatically creates the constructor for you however
//    the syntax is public MethodName () {};

    public Car(int doors, int wheels, String model, String engine, String color) {
        System.out.println("Car constructor called and parameters passed");
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    };

    // Calling a constructor inside another constructor is useful to define the parameters that will be used if no parameters are passed - must use this()
            // this MUST be the first line called within the constructor
    // you should not call any other method within the constructor (except for other constructors)
    public Car() {
        this(4, 4, "austin", "powerful", "pink");
        // this calls the other constructor
        System.out.println("Empty constructor called");
    } // aka setting default parameters

    // Assigning only some default parameters

    public Car(int doors, int wheels, String model, String engine) {
//        this("pink", model, doors, wheels, engine);
    }; // this constructor calls the original main constructor by the use of this

//Methods must be created to gain access to the variables(fields) defined within the class, outside of the class.
    // create a setter method

//Methods must be given public access so that we are able to access them in other classes

    //METHODS ARE WHERE WE SET THE REQUIREMENTS FOR THE VARIABLE
    public void setModel(String model) {
        // how do we access the actual field model and not the parameter model? (this)
        String validModel = model.toLowerCase();
        if(validModel.equals("civic") || validModel.equals("camry")) { // test to see if the value passed meets the criteria required to fit within the class and save the value to that key.
            //validation is done within the method
            this.model = model;
        } else {
            this.model = "Unknown";
        } // encapsulation - making the information inside the method private so that the data assigned is done so within the parameters and the parameters cannot be changed outside of the class.
    }

    // create a getter method

    public String getModel() {
        return this.model;
    }


// quickly create getters and setters in IntelliJ = cmd + n

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
} // car class closer
