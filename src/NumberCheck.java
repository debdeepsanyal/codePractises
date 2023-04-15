import java.util.Objects;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int sum=0, num;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while (check){
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            sum+=num;
            System.out.println("The sum of the numbers is " + sum);
            System.out.println("Do you want to continue? ");
            java.lang.String hold = sc.next();
            System.out.println(hold);
            if(Objects.equals(hold, "no")){
                break;
            }
        }

    }
}
