package KI305_Gnidec_Lab6;

/**
 * Клас, що представляє побутовий предмет.
 * Кожен побутовий предмет має назву (itemName) та ціну (price).
 */
public class HouseholdItem implements Data {
    /**
     * Назва побутового предмета.
     */
    private String itemName;
    /**
     * Ціна побутового предмета.
     */
    private int price;

    /**
     * Конструктор, що ініціалізує назву та ціну побутового
     * предмета.
     *
     * @param name назва побутового предмета.
     * @param price ціна побутового предмета.
     */
    static int count = 0;
    public HouseholdItem(String name, int price) {
        this.itemName = name;
        this.price = price;

        if(name == "Диван"){
            count++;
        }
    }

    /**
     * Повертає назву побутового предмета.
     *
     * @return назва побутового предмета.
     */
    public String getItemName() {
        return itemName;
    }
    public static int getAmount(){
       return count;
    }
    /**
     * Повертає ціну побутового предмета.
     *
     * @return ціну побутового предмета.
     */
    public int getPrice() {
        return price;
    }
    /**
     * Порівнює побутові предмети за їхньою ціною для
     * сортування.
     *
     * @param otherItem інший побутовий предмет для порівняння.
     * @return від'ємне число, нуль або додатне число, якщо цей
     * об'єкт менший, рівний або більший за інший предмет.
     */
    @Override
    public int compareTo(Data otherItem) {

        int u = Integer.compare(this.price, otherItem.getPrice());
        if(u==0){
             System.out.println("Предмети однакової ціни");
        }
        else if(u==1){
            System.out.println("Предмети більший за порівнюваний");
        }
        else if (u==-1){
            System.out.println("Предмети менший за порівнюваний");
        }
        else{
            System.out.println("Якийсь з предметів недоступний");

        }
        return 0;
    }

    /**
     * Виводить інформацію про побутовий предмет (назва та ціна)
     * у консоль.
     */
    public void print() {
        System.out.println("Предмет: " + itemName + ", його ціна: " + price);
    }
}