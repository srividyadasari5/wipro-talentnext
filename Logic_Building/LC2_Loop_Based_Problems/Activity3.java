import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Integer: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary Representation: 0");
        } else {
            String binary = "";

            while (n > 0) {
                binary = (n % 2) + binary;
                n = n / 2;
            }

            System.out.println("Binary Representation: " + binary);
        }

        sc.close();
    }
}