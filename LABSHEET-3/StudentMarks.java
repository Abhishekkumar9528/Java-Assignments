class StudentMarks {
    String name;
    int marks;

    StudentMarks(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    static StudentMarks updateMarks(StudentMarks s, int newMarks) {
        s.marks = newMarks;
        return s;
    }

    public static void main(String[] args) {
        StudentMarks st = new StudentMarks("Bob", 70);
        st.display();

        StudentMarks updatedSt = updateMarks(st, 90);
        updatedSt.display();
    }
}

