// Program 3: Access Modifiers

class Base {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    void displayBase() {
        System.out.println("Base: privateVar = " + privateVar +
                           ", protectedVar = " + protectedVar +
                           ", publicVar = " + publicVar);
    }
}

class Derived extends Base {
    void displayDerived() {
        System.out.println("Derived: protectedVar = " + protectedVar +
                           ", publicVar = " + publicVar);
    }
}

public class DerivedDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.displayBase();
        d.displayDerived();
    }
}

