import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * base);
            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal Equivalent: " + decimal);

        sc.close();
    }
}