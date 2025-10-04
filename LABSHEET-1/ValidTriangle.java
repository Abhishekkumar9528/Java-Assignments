import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter angle 2: ");
        int a2 = sc.nextInt();
        System.out.print("Enter angle 3: ");
        int a3 = sc.nextInt();

        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do NOT form a valid triangle.");
        }

        sc.close();
    }
}

