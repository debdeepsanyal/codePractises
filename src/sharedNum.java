import java.util.Scanner;

public class sharedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        System.out.println("Enter the first number :");
        number1 = sc.nextInt();
        int number2;
        System.out.println("Enter the second number :");
        number2 = sc.nextInt();
        System.out.println(ShareDigit(number1, number2));




    }
    public static boolean check(int n1, int n2){
        return n1 >= 10 & n1 <= 100 && n2 >= 10 & n2 <= 100;
    }
    public static String ShareDigit(int n1, int n2){
        if (check(n1, n2)){
               int n1_1 = n1%10;
               int n1_2 = n1/10;
               int n2_1 = n2%10;
               int n2_2 = n2/10;
               if(n1_1==n2_1 || n1_1==n2_2 || n1_2==n2_1 || n1_2 == n2_2){
                   return("It is a shared number");
               }
               else {
                   return ("It is not a shared number");
               }

        }
        else {
            return ("Not convenient");
        }

    }
}
