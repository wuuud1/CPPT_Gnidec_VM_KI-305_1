package KI305_Gnidec_Lab3;


/**
 * Клас, який представляє область проживанння собаки.
 * Область проживанння собаки є розширенням класу Dog та реалізує інтерфейс Movements для команд собакою.
 */
public class ArcticDog extends Dog implements Movements, NameOfCountruWhereLives {
    private boolean state;
    /**
     * Конструктор без параметрів для певної породи собаки.
     * Створює собаку певної породи яка при виклику стоїть.
     */

    public ArcticDog(Breed breed, Color color, Age age) {
        super(breed,color,age);
        state = false;
    }
    /**
     * Перевизначений метод для того щоб погладити собаку.
     */
    @Override
    public void petDog() {
        System.out.println("You petted the dog");
    }
    /**
     * Перевизначений метод для того щоб погодувати собаку.
     */
    @Override
    public void feedDog() {

        System.out.println("You fed the dog");
    }

    @Override
    public void setSitOrStay(boolean data) {
        this.state = data;
    }
    /**
     * Реалізація методу інтерфейсу Movements для виведення інформації про стан собаки.
     */
    @Override
    public void sitOrStayInfo() {
        if (state)
            System.out.println("Dog is sitting");
        else
            System.out.println("Dog is staying");
    }

    @Override
    public void countryInfo() {
        System.out.println("Dog is leaving in Arctic");
    }
}

