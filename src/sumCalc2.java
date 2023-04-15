import java.util.Objects;
import java.util.Scanner;

public class sumCalc2 {
    public static void main(String[] args) {
        sumCalculator calculator = new sumCalculator();
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        double res = 0;
        System.out.println("Enter your first number : ");
        double num_1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double num_2 = sc.nextDouble();
        System.out.println("which operation would you like to do -");
        System.out.println("+");
        System.out.println('-');
        System.out.println("*");
        System.out.println("/");
        if(Objects.equals(operation, "+")){
            res = calculator.addRes(num_1,num_2);
            System.out.println(res);
        }
        if(Objects.equals(operation, "-")){
            res = calculator.subRes(num_1,num_2);
            System.out.println(res);
        }
        if(Objects.equals(operation, "*")){
            res = calculator.mulRes(num_1,num_2);
            System.out.println(res);
        }
        if(Objects.equals(operation, "/")){
            res = calculator.divRes(num_1,num_2);
            System.out.println(res);
        }
        System.out.println(res);
//        System.out.println("Would you like to continue with the operations ? ");
//        System.out.println("Yes/No");
//        String yn = sc.next();
//        yn = yn.toLowerCase();
//        while (yn != "no"){
//            System.out.println("Enter the next number : ");
//            double num_3 = sc.nextDouble();
//            System.out.println("which operation would you like to do -");
//            System.out.println("+");
//            System.out.println('-');
//            System.out.println("*");
//            System.out.println("/");
//            if(operation == "+"){
//                double res_2 = calculator.addRes(res,num_2);
//                System.out.println(res);
//            }
//            if(operation == "-"){
//                res = calculator.subRes(num_1,num_2);
//                System.out.println(res);
//            }
//            if(operation == "*"){
//                res = calculator.mulRes(num_1,num_2);
//                System.out.println(res);
//            }
//            if(operation == "/"){
//                res = calculator.divRes(num_1,num_2);
//                System.out.println(res);
//            }
//        }
    }
}
