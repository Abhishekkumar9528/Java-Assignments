class BookReference {
    String title;
    double price;

    BookReference(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: $" + price);
    }

    public static void main(String[] args) {
        BookReference b1 = new BookReference("Java Basics", 300);
        BookReference b2 = new BookReference("Python Basics", 400);

        b1.display();
        b2.display();

        // Assign b1 reference to b2
        b2 = b1;

        // Modify b1
        b1.price = 350;
        b1.title = "Java Advanced";

        // Both b1 and b2 reflect changes
        b1.display();
        b2.display();
    }
}

