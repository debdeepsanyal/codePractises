import java.util.Scanner;

public class test_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        check(s);

    }
    public static void check(String string){
        int length = string.length();
        System.out.printf("The length of the string is %d %n", length);
        char c = string.charAt(0);
        System.out.printf("The first character of the string is %c", c);
    }
}
