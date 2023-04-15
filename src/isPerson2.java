import java.util.Scanner;

public class isPerson2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String f_name = sc.next();
        System.out.println("Enter the last name : ");
        String l_name = sc.next();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        isPerson person = new isPerson(f_name, l_name, age);
        System.out.println("The full name of the person stands as " + person.getFullName());
        System.out.println("Teen check - " + person.isTeen());
    }
}
