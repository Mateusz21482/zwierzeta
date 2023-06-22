package zwierzeta;
import lombok.Getter;

/**
 * Klasa reprezentująca tygrysa.
 */
public class tiger {
@Getter
    /**
     * Metoda wyświetlająca nazwę zwierzęcia.
     */
    public void printAnimalName() {
        System.out.println("Tiger");
    }

    /**
     * Metoda symulująca ryk tygrysa.
     */
    public void growl() {
        System.out.println("poluje!");
    }
}
