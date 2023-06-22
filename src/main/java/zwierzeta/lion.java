package zwierzeta;
import lombok.Getter;

/**
 * Klasa reprezentująca lwa.
 */
public class lion {
@Getter
    /**
     * Metoda wyświetlająca nazwę zwierzęcia.
     */
    public void printAnimalName() {
        System.out.println("Lion");
    }

    /**
     * Metoda symulująca ryk lwa.
     */
    public void roar() {
        System.out.println("roar!");
    }
}
