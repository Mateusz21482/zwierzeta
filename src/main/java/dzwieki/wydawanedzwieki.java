import zwierzeta.lion;
import zwierzeta.tiger;
import zwierzeta.parrot;

/**
 * Klasa demonstracyjna do wydawania dźwięków przez różne zwierzęta.
 */
public class wydawanedzwieki {

    /**
     * Metoda główna programu.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        lion lion = new lion();
        tiger tiger = new tiger();
        parrot parrot = new parrot();

        lion.printAnimalName();
        lion.roar();

        tiger.printAnimalName();
        tiger.growl();

        parrot.printAnimalName();
        parrot.speak();
    }
}

