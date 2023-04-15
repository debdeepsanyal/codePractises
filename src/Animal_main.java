public class Animal_main {
    public static void main(String[] args) {
        Animal animal = new Animal("small",210,"reptile");
        Dog retriever = new Dog();
        forAnimal(animal,"fast");
        forAnimal(retriever, "slow");
        Animal billa = new Animal("small",7);
        forAnimal(billa,"fast");
        Dog Rottweiler = new Dog();
        forAnimal(Rottweiler, "fast");
        Fish rohu = new Fish(1,3,1);
        forAnimal(rohu,"fast");

    }
    public static void forAnimal(Animal animal, String speed){
        animal.toMove(speed);
        animal.makeNoise();
        System.out.println(animal);
    }
}
