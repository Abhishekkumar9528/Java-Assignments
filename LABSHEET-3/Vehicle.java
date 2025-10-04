class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();
        car.startEngine();
        bike.startEngine();
    }
}

