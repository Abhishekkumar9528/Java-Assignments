// Program 9: Superclass Reference → Subclass Object

class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing...");
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.work();
    }
}


