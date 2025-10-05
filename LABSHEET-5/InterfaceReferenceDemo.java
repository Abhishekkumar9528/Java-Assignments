// Program 13: Interface Reference

interface Movable2 {
    void moveUp();
    void moveDown();
}

class Robot2 implements Movable2 {
    @Override
    public void moveUp() {
        System.out.println("Robot2 moves up");
    }
    @Override
    public void moveDown() {
        System.out.println("Robot2 moves down");
    }
}

public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        Movable2 m = new Robot2(); // interface reference
        m.moveUp();
        m.moveDown();
    }
}

