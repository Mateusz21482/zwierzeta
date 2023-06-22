import zwierzeta.lion;
import zwierzeta.parrot;
import zwierzeta.tiger;

public class wydawanedzwieki {
    public static void main(String[] args) {
        lion Lion = new lion();
        tiger Tiger = new tiger();
        parrot Parrot = new parrot();

        Lion.printAnimalName();
        Lion.roar();

        Tiger.printAnimalName();
        Tiger.growl();

        Parrot.printAnimalName();
        Parrot.speak();
    }
}
