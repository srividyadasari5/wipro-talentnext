import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No divisor other than 1.");
        } else {

            int divisor = n;

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    divisor = i;
                    break;
                }
            }

            System.out.println("Smallest Exact Divisor Other Than 1: " + divisor);
        }

        sc.close();
    }
}