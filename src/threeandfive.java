public class threeandfive {
    public static void main(String[] args) {
        int c = 0;
        int s =0;
        for(int i =1; i<=1000; i++){
            if(isDivFive(i) && isDivThree(i)){
                c++;

                if(c==6){
                    break;
                }
                s+= i;
                System.out.println("The number is "+ i);

            }

        }
        System.out.println("The sum of the numbers is "+ s);
    }
    public static boolean isDivThree(int number){
        return number % 3 == 0;
    }
    public static boolean isDivFive(int number){
        return number % 5 == 0;
    }
}
