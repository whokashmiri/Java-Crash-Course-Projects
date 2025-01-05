package DSA.OOPS;

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Calls add(int, int)
        System.out.println(math.add(2, 3, 4));     // Calls add(int, int, int)
        System.out.println(math.add(2.5, 3.5));    // Calls add(double, double)
    }
}


//
class Animall {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animall {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animall {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

 class Main {
    public static void main(String[] args) {
        Animall myDog = new Dog();
        Animall myCat = new Cat();

        myDog.makeSound(); // Calls Dog's makeSound()
        myCat.makeSound(); // Calls Cat's makeSound()
    }
}

