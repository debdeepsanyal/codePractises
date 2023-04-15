import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int number;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for palindrome");
        number = sc.nextInt();
        int num2;
        num2= number;
        while (number != 0){
            int d;
            d = number % 10;
            s = (s*10) + d;
            number/= 10;

        }
        if(s == num2){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
