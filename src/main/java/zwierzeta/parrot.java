package zwierzeta;
import lombok.Getter;

/**
 * Klasa reprezentująca papugę.
 */
public class parrot {
@Getter
    /**
     * Metoda wyświetlająca nazwę zwierzęcia.
     */
    public void printAnimalName() {
        System.out.println("Parrot");
    }

    /**
     * Metoda symulująca mówienie papugi.
     */
    public void speak() {
        System.out.println("papuguje!");
    }
}
