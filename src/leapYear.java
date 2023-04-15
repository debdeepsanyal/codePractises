import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();
        System.out.println("Enter month of year " + year);
        int month = sc.nextInt();
        month(month, year);

    }
    public static int leap(int yearf){

        if (yearf%4 == 0){
            if (yearf%100 == 0){
                if (yearf%400 == 0){
                    return 1;
                }
                else{
                    return 0;
                }

            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
    }
    public static void month(int mon, int yearmon){
        if(leap(yearmon) == 1){
            if(mon==2){
                System.out.println("The month has 29 days");
            }

            else if(mon<=7){
                if(mon%2 != 0){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            } else if (mon<=12) {
                if(mon%2 == 0){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            } else if (mon>12){
                System.out.println("Invalid entry");
            }

        }
        else{
            if(mon==2){
                System.out.println("The month has 28 days");
            }

            else if(mon<=7){
                if(mon%2 != 0){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            } else if (mon<=12) {
                if(mon%2 == 0){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            } else if (mon>12){
                System.out.println("Invalid entry");
            }

        }
    }
}
