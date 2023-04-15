import java.util.Scanner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the first number of the range ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number of the range ");
        int end = sc.nextInt();
        for(int i = start; i<= end; i++){
            if(isOdd(i)){
                c+=i;
            }
        }
        System.out.println("The sum of the odd numbers in the provided range is "+ c);

    }
    public static boolean isOdd(int number){
        if (number<0){
            return false;
        }
        return number % 2 != 0;
    }
}
