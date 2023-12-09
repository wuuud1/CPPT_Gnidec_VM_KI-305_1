package KI305_Gnidec_Lab6;
import java.util.ArrayList;
/**
 * Клас, що представляє пакет для зберігання побутових предметів.
 * Пакет може містити об'єкти, які є підкласами класу
 HouseholdItem.
 *
 * @param <T> тип об'єктів, які можуть бути додані до пакету.
 */
public class HouseholdPackage<T extends Data> {
    /**
     * Список елементів у пакеті.
     */
    private ArrayList<T> items;

    /**
     * Конструктор за замовчуванням, створює порожній пакет.
     */
    public HouseholdPackage() {
        items = new ArrayList<>();
    }

    /**
     * Пошук найбільшого об'єкта у пакеті за їхньою ціною.
     *
     * @return найдорожчий об'єкт у пакеті або null, якщо пакет
     * порожній.
     */
    public T findMax() {
        if (!items.isEmpty()) {
            T max = items.get(0);
            for (int i = 1; i < items.size(); i++) {
                if (items.get(i).compareTo(max) > 0) {
                    max = items.get(i);
                }
            }
            return max;
        }
        return null;
    }

    /**
     * Додає об'єкт до пакету і виводить повідомлення про успішне
     * додавання.
     *
     * @param item об'єкт, який додається до пакету.
     */
    public void addItem(T item) {
        items.add(item);
        System.out.print("Предмет додано: ");
        item.print();
    }

    /**
     * Видаляє об'єкт із пакету за вказаним індексом і виводить
     * повідомлення про успішне видалення.
     *
     * @param index індекс об'єкта, який потрібно видалити.
     */
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            T removedItem = items.remove(index);
            System.out.print("Предмет видалено: ");
            removedItem.print();
        } else {
            System.out.println("Неіснуючий індекс. Предмет не видалено");
        }
    }
}