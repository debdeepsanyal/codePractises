//public class challenge {
//    public static void main(String[] args){
//        boolean gameOver = true;
//        int score = 10000;
//        int level = 7;
//        int bonus = 200;
//
//
//
//        if(gameOver){
//            scoreCard(score,level, bonus);
//        }
//
//
//    }
//    public static void scoreCard(int var1, int var2, int var3){
//        int finalScore = var1;
//        finalScore += (var2 * var3);
//        System.out.println("The final score is " + finalScore);
//    }
//}

import java.util.Scanner;

public class challenge {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age year");
        age = sc.nextInt();
        System.out.println("Your age is " + ageFunc(age));
    }
    public static int ageFunc(int agef){
        return (2022-agef);
                

    }
}
