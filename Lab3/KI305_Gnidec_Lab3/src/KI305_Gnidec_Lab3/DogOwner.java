package KI305_Gnidec_Lab3;

/**
 * Головний клас, який представляє програму для власника собаки.
 */
public class DogOwner {
    /**
     * Головний метод програми.
     *
     * @param args Масив рядків аргументів командного рядка.
     */
    public static void main(String[] args) {

        // Ініціалізація полів

       ArcticDog haski = new ArcticDog(new Breed("Haski","this is artic dog"), new Color("white"), new Age(2));
        System.out.println(haski);

        haski.call();

        haski.sitOrStayInfo();

        haski.setSitOrStay(true);

        haski.sitOrStayInfo();

        haski.setSitOrStay(false);

        haski.sitOrStayInfo();

        haski.spinAroundThroughLeft();

        haski.petDog();

        haski.feedDog();
        haski.countryInfo();
    }
}

