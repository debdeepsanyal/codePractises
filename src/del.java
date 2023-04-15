import java.util.Scanner;

public class del{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point ");
        int start = sc.nextInt();
        System.out.println("Enter the starting difference ");
        int diff_1 = sc.nextInt();
        System.out.println("Enter GP value ");
        int gp = sc.nextInt();
        System.out.println("Enter ending value");
        int end = sc.nextInt();

        System.out.println(start);
        for (int i = start; i<=end; i++){
            start+=(diff_1*i);
            if (start>end){
                break;
            }
            System.out.println(start);

        }
    }
}