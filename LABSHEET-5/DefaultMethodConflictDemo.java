// Program 15: Resolving Default Method Conflict

interface A {
    default void show() {
        System.out.println("Default method from interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Default method from interface B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // Resolve conflict using explicit interface calls
        A.super.show();
        B.super.show();
        System.out.println("Resolved in class C");
    }
}

public class DefaultMethodConflictDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

