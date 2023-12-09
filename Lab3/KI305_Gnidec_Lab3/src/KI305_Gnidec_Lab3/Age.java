package KI305_Gnidec_Lab3;

/**
 * Клас, що представляє вік собаки
 */
public class Age {
    // Поле класу
    private int age; // Вік собаки

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Age з нульовою сумою.
     */
    public Age() {

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Age з вказаним віком собаки.
     *
     * @param age вік собаки.
     */
    public Age(int age) {
        this.age = age;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Age.
     */
    @Override
    public String toString() {
        return "Age " + "age: " + age;
    }
}
