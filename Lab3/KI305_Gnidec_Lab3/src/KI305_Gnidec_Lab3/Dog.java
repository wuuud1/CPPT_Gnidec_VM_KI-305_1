package KI305_Gnidec_Lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Клас, що представляє собаку та зберігає інформацію про неї.
 */
public abstract class Dog {
    //Поля класу
    private Breed breed;
    private Color color;
    private Age age;

    //Поле для запису протоколу
    private PrintWriter logWriter;

    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Dog та створює файл протоколу.
     */
    //Пустий конструктор без аргументів
    public Dog() {
        try {
            logWriter = new PrintWriter(new FileWriter("D:\\NULP\\KZP\\Lab3\\KI305_Gnidec_Lab3\\Dog.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Конструктор зі всіма аргументами
    public Dog(Breed breed, Color color, Age age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        try {
            logWriter = new PrintWriter(new FileWriter("D:\\NULP\\KZP\\Lab3\\KI305_Gnidec_Lab3\\Dog.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void petDog();
    public abstract void feedDog();



    /**
     * Метод для запису дій в файл протоколу.
     *
     * @param activity Дія, яку потрібно зареєструвати в протоколі.
     */

    private void logActivity(String activity) {
        if (logWriter != null) {
            logWriter.println(activity);
            logWriter.flush();
        }
    }

    //Методи для роботи з автомобілем


    public void spinAroundThroughLeft() {
        System.out.println("Dog is being said to spin around through the left side.");
        logActivity("You told the dog to spin around through the left side.");//Запис у протокол
    }

    public void spinAroundThroughRight() {
        System.out.println("Dog is being said to spin around through the right side.");
        logActivity("You told the dog to spin around through the right side.");//Запис у протокол
    }

    public void goForAWalk() {
        System.out.println("Go for a walk with dog.");
        logActivity("You went for a walk with dog\"");//Запис у протокол
    }

    public void call() {
        System.out.println("You called the dog.");
        logActivity("You called the dog.");//Запис у протокол
    }


    // Метод для закриття файлу протоколу
    private void closeLogFile() {
        if (logWriter != null) {
            logWriter.close();
        }
    }
    //Метод toString()
    @Override
    public String toString() {
        return "Dog:\nBreed - " + breed + "\nColor - " + color + "\nAge - " + age;
    }

}

