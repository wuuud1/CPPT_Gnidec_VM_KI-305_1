package KI305_Gnidec_Lab6;
/**
 * Інтерфейс, що представляє об'єкти, які можуть бути збережені та
 порівнювані за їхньою ціною.
 */
public interface Data extends Comparable<Data> {
    /**
     * Повертає розмір об'єкта.
     *
     * @return розмір об'єкта.
     */
    int getPrice();

    /**
     * Виводить інформацію про об'єкт.
     */
    void print();
}