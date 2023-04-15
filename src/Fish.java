public class Fish extends Animal{
    private int fin;
    private int gill;

    public Fish( int weight,  int fin, int gill) {
        super("small", weight, "fish");
        this.fin = fin;
        this.gill = gill;
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void toMove(String speed) {
        speedCheck(fin);
        System.out.println(" at" + speed);
    }
    private void speedCheck(int fin){
        if(fin>=3){
            System.out.print("fish moves fast");
        }
        else{
            System.out.print("fish moves slow");
        }
    }
}
