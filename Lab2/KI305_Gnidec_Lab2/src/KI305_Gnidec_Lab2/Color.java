package KI305_Gnidec_Lab2;

/**
 * Клас, що представляє колір собаки.
 */
public  class Color {
    // Поле класу
    public String nameColor; // Забарвлення собаки
    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Color з пустою назвою моделі.
     */
    public Color(){

    }

    /**
     * Конструктор з усіма аргументами.
     * Ініціалізує об'єкт Color з вказаною назвою моделі.
     *
     * @param nameColor Назва забарвлення собаки.
     */
    public  Color(String nameColor){
        this.nameColor = nameColor;
    }

    /**
     * Перевизначений метод toString().
     *
     * @return Рядок, що представляє об'єкт Color.
     */
    @Override
    public String toString() {
        return "Color " +
                "name: " + nameColor;
    }



}
