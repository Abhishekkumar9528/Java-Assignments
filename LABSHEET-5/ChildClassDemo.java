// Program 10: Using super to access hidden method

class ParentClass {
    void display() {
        System.out.println("Display method in ParentClass");
    }
}

class ChildClass extends ParentClass {
    @Override
    void display() {
        System.out.println("Display method in ChildClass");
    }

    void showBoth() {
        display();       // Child version
        super.display(); // Parent version
    }
}

public class ChildClassDemo {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.showBoth();
    }
}

