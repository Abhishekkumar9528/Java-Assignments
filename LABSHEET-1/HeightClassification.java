import java.util.Scanner;

public class HeightClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();

        if (height < 150) {
            System.out.println("Person is Short.");
        } else if (height >= 150 && height < 170) {
            System.out.println("Person is Average height.");
        } else {
            System.out.println("Person is Tall.");
        }

        sc.close();
    }
}

