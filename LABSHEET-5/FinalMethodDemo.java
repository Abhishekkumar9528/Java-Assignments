// Program 5: Final Method

class Parent {
    final void show() {
        System.out.println("This is a final method in Parent.");
    }
}

public class FinalMethodDemo extends Parent {
    public static void main(String[] args) {
        FinalMethodDemo obj = new FinalMethodDemo();
        obj.show();
    }
}

