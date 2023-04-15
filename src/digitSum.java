import java.util.Scanner;

public class digitSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int s = 0;
        while (number>0){
            int d = number % 10;
            number = number / 10;
            s+=d;

        }
        System.out.println("The sum of the digits of the number is "+ s );
    }
}
