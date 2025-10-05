// Program 14: Interface with static and default methods

interface MyInterface {
    static void staticMethod() {
        System.out.println("This is a static method in interface");
    }

    default void defaultMethod() {
        System.out.println("This is a default method in interface");
    }
}

class MyClass implements MyInterface {
    // can use default method as is
}

public class StaticDefaultInterfaceDemo {
    public static void main(String[] args) {
        // Call static method
        MyInterface.staticMethod();

        // Call default method
        MyClass obj = new MyClass();
        obj.defaultMethod();
    }
}

