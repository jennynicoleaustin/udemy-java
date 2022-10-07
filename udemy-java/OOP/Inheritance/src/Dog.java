/*
To be able to "extends" a class we need a constructor for that class (dog) that calls the constructor of the super class (Animal). --- Super (base) class that extends to the class.

   - Dog will inherit all characteristics of the super class (Animal) but now we can define additional characteristics and methods specific to the Dog (class)
 */

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String fur;


// If you build the constructor prior to initializes additional variables specific to the dog class than it will only include parameters of animals
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight); // this initializes the parameters within the super class
    }

// If you use the builder to create a constructor after you've added the dog fields the constructor will include all the fields of Dog and the fields of Animal
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int teeth, int tail, String fur) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.fur = fur;
    }



    // Method unique to Dog?
    // Overriding allows us to create a method that is like a method found in the super class but make it unique for the dog class.
            // Overriding can be found in the generation tool

    @Override
    public void eat() {
        System.out.println("dog.eat method called");
        chew();
        super.eat();
    }
    public void chew (){
        System.out.println("dog.eat Dogs eat by chewing their food.");
    }

    public void run(){
        System.out.println("Dog.walk() called");
        move(55); // by not specifying super.move, this will allow the program to find the first most accessible move method to run first
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        super.move(speed);
    }
} // Dog class
