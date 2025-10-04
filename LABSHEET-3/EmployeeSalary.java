class EmployeeSalary {
    String name;
    double salary;

    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }

    // Method to update salary
    static void updateSalary(EmployeeSalary e, double newSalary) {
        e.salary = newSalary;
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary("Alice", 50000);
        emp.display();

        updateSalary(emp, 60000);
        emp.display();
    }
}

