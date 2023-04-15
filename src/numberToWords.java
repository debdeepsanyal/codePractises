import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        String array[]=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter the number : ");
        number = sc.nextInt();
        String s1 = "";
        while (number != 0){
            int d = number%10;
            s1 = array[d] + " " + s1;
            number/=10;
        }
        System.out.println(s1);

    }
}
