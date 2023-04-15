public class Dog extends Animal{

    public Dog() {
        super("Huge",500,"Mammal");
    }

    @Override
    public void toMove(String speed) {
        super.toMove(speed);
        if(speed == "slow"){
            walk();
        }
        else if (speed == "fast") {
            run();
        }

    }
    private void run(){
        System.out.println("The dog is running and is full of energy");
    }
    private void walk(){
        System.out.println("the dog is walking and its quite relaxed");
    }

}
