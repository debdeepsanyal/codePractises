import java.util.Scanner;

public class highscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the player : ");
        int score = sc.nextInt();
        System.out.println("Enter the player's name : ");
        String name = sc.next();
        System.out.println("Player " + name + " has managed to get in the position " + HighScore(score) + " with his game.");
    }
    public static int HighScore(int scorer){
        if (scorer >= 1000){
            return 1;
        }
        else if (scorer>=500) {
            return 2;
        }
        else if (scorer >= 100) {
            return 3;
        }
        else{
            return 4;
        }
    }
}
