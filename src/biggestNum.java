import java.util.Scanner;

public class biggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c = 0;
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int num2 = num;
        while(num2!=0){
            r = num2%10;
            if(r>c){
                c = r;
            }
            num2/=10;
        }
        System.out.println("The largest number in " + num + " is " + c);

    }
}
