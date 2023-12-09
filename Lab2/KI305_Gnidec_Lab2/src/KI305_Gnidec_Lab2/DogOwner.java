package KI305_Gnidec_Lab2;

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
        Breed breed = new Breed("Ретривер", " \"Золотистий ретривер\" , - це порода мисливських підручничних собак.");
        Color color = new Color("Чорний");
        Age age = new Age(0);

        // Зміна полів за допомогою метода Сет і відображення зміненого за допомогою метода Гет

        Dog dog2 = new Dog(breed, new Color("Чорний"), new Age(1));



        main1();


        Dog dog3 = new Dog(breed, new Color("Коричневий"), new Age(2));


        System.out.println("Number of dogs whose age is greater than 1: " + Dog.ageGreaterThanOneCounter);

        System.out.println("\nList of dog colors whose age is greater than 1:" + Dog.dogColorList);


    }

    public static void main1() {
        Breed breed = new Breed("Ретривер", " \"Золотистий ретривер\" , - це порода мисливських підручничних собак.");
        Color color = new Color("Чорний");
        Age age = new Age(0);

        // Зміна полів за допомогою метода Сет і відображення зміненого за допомогою метода Гет

        Dog dog2 = new Dog(breed, new Color("Чорний"), new Age(2));    }

    }

