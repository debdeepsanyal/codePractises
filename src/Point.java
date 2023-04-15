import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first point x1  : ");
        int x1 = sc.nextInt();
        System.out.println("Enter the second point x2  : ");
        int x2 = sc.nextInt();
        System.out.println("Enter the first point y1  : ");
        int y1 = sc.nextInt();
        System.out.println("Enter the second point y2  : ");
        int y2 = sc.nextInt();
        pointClass geo = new pointClass(x1,x2, y1, y2);
        System.out.println("Do you want the distance from the origin ? Y/N ");
        String input = sc.next();
        input = input.toLowerCase();
        if (input.equals("y")){
            System.out.println("The distance of the point from the origin is " + geo.originDistance());
        }
        if (input.equals("n")){
            System.out.println("Do you want the distance between the two points? ");
            String input2 = sc.next();
            input2 = input2.toLowerCase();
            if (input2.equals("y")){
                System.out.println("The distance between the two points is " + geo.returnDist());
            }
            else {
                System.out.println("oops! sorry");
            }
        }

    }
}
