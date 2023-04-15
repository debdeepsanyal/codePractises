import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class password {
    public static void main(String[] args) {
        String char_list[]={"a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H"
        ,"i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R",
        "s","S","t","T","u","U","V","v","w","W","x","X","y","Y","z","Z"};
        String int_list[]={"1","2","3","4","5","6","7","8","9","10"};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many letters do you want in the password? ");
        int words = sc.nextInt();
        System.out.println("How many numbers do you want in the password? ");
        int numbers = sc.nextInt();
        String word_ = "";
        String number_ = "";
        for(int i=0; i<=words; i++){
            word_+=getRandomElement(char_list);
        }
        for(int i=0; i<=numbers; i++){
            number_+=getRandomElement(int_list);
        }
        String s = word_ + number_;

        List<String> characters = Arrays.asList(s.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String character : characters)
        {
            afterShuffle += character;
        }
        System.out.println(afterShuffle);



    }
    public static <T> T getRandomElement(T[] arr){
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }
}
