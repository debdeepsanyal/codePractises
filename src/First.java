public class First {
    public static void main(String[] args){

        double number1 = 20.0;
        double number2 = 80.0;
        double res = ((number1 + number2)*100);
        double res2 = res % 40;
        boolean isTrue;
        isTrue = res2 == 0;
        System.out.println(isTrue);
        if(!isTrue){
            System.out.println(res2 + "is the remainder of the operation");
        }

    }
}