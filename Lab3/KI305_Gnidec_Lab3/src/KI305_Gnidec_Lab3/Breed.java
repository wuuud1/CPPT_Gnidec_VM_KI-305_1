package KI305_Gnidec_Lab3;

/**
 * Клас, що представляє інформацію про породу собаки
 */
public class Breed {
    // Поля класу
    private String nameBreed; // Назва компанії
    private String infoBreed; // Інформація про компанію

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Breed з пустими значеннями.
     */
    public Breed(){

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Breed з вказаними параметрами.
     *
     * @param nameBreed Назва породи.
     * @param infoBreed Інформація про породу.
     */
    public Breed(String nameBreed, String infoBreed){
        this.nameBreed = nameBreed;
        this.infoBreed = infoBreed;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Breed.
     */
    @Override
    public String toString() {
        return "Breed " +
                "name: " + nameBreed +
                ", info: " + infoBreed;
    }
}
