import java.util.Objects;
import java.util.Scanner;

public class barkingDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the dog barking? ");
        String barking = sc.next();
        System.out.println("What time is it? ");
        int time = sc.nextInt();
        boolean bar;
        bar = Objects.equals(barking, "yes");
        String yn;
        boolean var = bark(bar, time);
        if (var) {
            yn = "yes";
        } else {
            yn = "no";
        }
        System.out.println("Should you wake up? " + yn);

    }
    public static boolean bark(boolean isBarking, int timef){
        if (isBarking){
            return timef < 8 || timef > 22;
        }
        else{
            return false;
        }


    }
}
