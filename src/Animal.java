public class Animal {
    private String size;
    private String type;
    private int weight;


    public Animal(String size, int weight, String type){
        this.size = size;
        this.weight = weight;
        this.type = type;

    }
    public Animal(String size,int weight){
        this(size,weight,"mammal");
    }







    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void toMove(String speed){
        System.out.println("Animal moves " + speed);
    }
    public void makeNoise(){
        System.out.println("Animal makes a noise");
    }

}
