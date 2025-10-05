// Animal.java

class Animal {
    public static void main(String[] args){}
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }

    public static void main(String[] args) {
        // Polymorphism demonstration
        Animal a = new Dog();  // Parent reference → Child object
        a.makeSound();         // Calls Dog's overridden method
    }
}

