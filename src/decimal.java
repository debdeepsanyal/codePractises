import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,r;
        String ch = "";
        System.out.println("Enter a number ");
        num = sc.nextInt();
        while(num>0){
            r = num%2;
            ch = r + ch;
            num/=2;

        }
        System.out.println(ch);

    }
}
