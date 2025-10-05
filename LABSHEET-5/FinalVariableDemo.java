// Program 6: Final Variable

public class FinalVariableDemo {
    final int value = 100;

    void show() {
        System.out.println("Final variable value: " + value);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.show();
    }
}
