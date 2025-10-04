import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        // Total and percentage
        int total = s1 + s2 + s3;
        double percentage = total / 3.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Pass/Fail check
        if (s1 >= 40 && s2 >= 40 && s3 >= 40) {
            System.out.println("Result: PASS ✅");
        } else {
            System.out.println("Result: FAIL ❌");
        }

        sc.close();
    }
}

