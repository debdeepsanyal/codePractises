import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you would want to check prime numbers : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }

            }
            if (c == 2) {
                System.out.println(i);

            }
        }

    }
}