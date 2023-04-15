import java.util.Scanner;

public class bag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of kilos : ");
        int kilo = sc.nextInt();
        int bag_5, bag_1;
        bag_5 = kilo/5;
        bag_1 = kilo%5;
        System.out.println("You will be having " + bag_5 + " 5-kilo bags and " + bag_1 + " 1- kilo bags");
    }
}
