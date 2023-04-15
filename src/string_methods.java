import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate ");
        String birthDate = sc.nextLine();
        birthDate = birthDate.trim();
        System.out.println("The birth year is " + birthDate.substring(6));
        System.out.println(birthDate.indexOf("2003"));
        System.out.println("The birth month is " + birthDate.substring(3,5)); //prints from position including index 3 and excluding index 5
        String newDate = String.join("/", "02", "11","2003");
        System.out.println(newDate);
        System.out.println(newDate.replace('/','.'));
        System.out.println(newDate.replaceFirst("/","."));
        System.out.println("hi\n".repeat(5).indent(5));//repeat prints the string n number of times while indent adds n number of spaces in front of the string 
    }
}
