package KI305_Gnidec_Lab6;

/**
 * Клас, який демонструє використання класів HouseholdItem та
 HouseholdPackage.
 */
public class HouseholdPackageDriver {
    public static void main(String[] args) {
        HouseholdPackage<HouseholdItem> package1 = new HouseholdPackage<>();
        HouseholdPackage<HouseholdItem> package2 = new HouseholdPackage<>();

        HouseholdItem item1 = new HouseholdItem("Диван", 25);
        HouseholdItem item2 = new HouseholdItem("Телевізор", 50);
        HouseholdItem item3 = new HouseholdItem("Посудомийна машина", 90);
        HouseholdItem item4 = new HouseholdItem("Диван", 10);
        HouseholdItem item5 = new HouseholdItem("Диван", 15);



        package1.addItem(item1);
        package1.addItem(item2);
        package1.addItem(item3);

        System.out.println();

        package2.addItem(item4);
        package2.addItem(item5);
        System.out.print("Кількість диванів в пакеті: ");

        System.out.println(HouseholdItem.getAmount());


        HouseholdItem maxItem1 = package1.findMax();

        if (maxItem1 != null) {
            System.out.print("Найдорожчий предмет в пакеті 1: ");
            maxItem1.print();
        } else {
            System.out.println("Пакет 1 порожній.");
        }

        HouseholdItem maxItem2 = package2.findMax();

        if (maxItem2 != null) {
            System.out.print("Найдорожчий предмет в пакеті 2: ");
            maxItem2.print();
        } else {
            System.out.println("Пакет 1 порожній.");
        }

        System.out.println();
        System.out.println("Видаляємо предмет з пакету 1.");

        package1.removeItem(2);
        System.out.println();


        System.out.println("Видаляємо предмет з пакету 2.");

        package2.removeItem(0);
        System.out.println();


        System.out.println( item2.compareTo(item1));

    }
}