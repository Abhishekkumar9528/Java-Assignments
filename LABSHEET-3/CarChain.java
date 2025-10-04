class CarChain {
    String color;
    int speed;

    CarChain setColor(String color) {
        this.color = color;
        return this; // returning this allows chaining
    }

    CarChain setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    void display() {
        System.out.println("Car Color: " + color + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        CarChain myCar = new CarChain();
        myCar.setColor("Red").setSpeed(120).display(); // Method chaining
    }
}
