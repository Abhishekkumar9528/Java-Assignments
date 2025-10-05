// Program 12: Interface Implementation Example

interface Movable {
    void moveUp();
    void moveDown();
}

class Robot implements Movable {
    @Override
    public void moveUp() {
        System.out.println("Robot moves up");
    }

    @Override
    public void moveDown() {
        System.out.println("Robot moves down");
    }
}

public class RobotDemo {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.moveUp();
        r.moveDown();
    }
}

