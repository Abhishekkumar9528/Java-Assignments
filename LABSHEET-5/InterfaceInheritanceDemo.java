// Program 16: Interface extending another interface

interface BaseInterface {
    void baseMethod();
}

interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

class MyDerivedClass implements DerivedInterface {
    @Override
    public void baseMethod() {
        System.out.println("Base method implemented");
    }
    @Override
    public void derivedMethod() {
        System.out.println("Derived method implemented");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        MyDerivedClass obj = new MyDerivedClass();
        obj.baseMethod();
        obj.derivedMethod();
    }
}

