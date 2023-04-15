import java.util.Scanner;

public class speedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter speed in kilometres per hour");
        double speed = sc.nextInt();
        System.out.println("Your converted speed in miles per hour is " + converter(speed));

    }
    public static double converter(double speedf){
        if (speedf < 0){
            return (-1);

        }
        else{
            return (speedf*0.621);
        }
    }
}
