// Program 2: Person → Student (Using super constructor)

class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called.");
    }
}

class Student extends Person {
    int id;
    Student(String name, int id) {
        super(name);
        this.id = id;
        System.out.println("Student constructor called.");
    }
    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}



