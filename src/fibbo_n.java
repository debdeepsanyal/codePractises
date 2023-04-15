import java.util.Scanner;

public class fibbo_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the nth term of the Fibonacci series ");
        num = sc.nextInt();
        int[] array = new int[num+1];
        array[0] = 1;
        array[1] = 1;
        for(int i = 3; i<=num; i++){
            array[i-1] = array[i-2] + array[i-3];
        }
        System.out.println(array[num-1]);
    }
}
