import java.util.Scanner;

public class megabyteConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in kilobytes ");
        int kb = sc.nextInt();
        converter(kb);
    }
    public static void converter(int kbf){
        System.out.println("You have " + (kbf/1024) + " megabytes and " + (kbf%1024) + " kilobytes.");

    }
}
