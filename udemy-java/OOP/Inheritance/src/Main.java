/* Inheritance


 */


public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("Cattle Dog",1, 1, 4, 45, 2, 4, 50, 1, "short");
        dog.eat();
        dog.run();
    }
}