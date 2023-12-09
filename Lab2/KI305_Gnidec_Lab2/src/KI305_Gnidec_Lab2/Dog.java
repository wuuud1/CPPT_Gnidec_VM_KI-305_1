package KI305_Gnidec_Lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє собаку та зберігає інформацію про неї.
 */
public class Dog {
    //Поля класу
    public  Breed breed;
    public  Color color;
    public Age age;

    //Поле для запису протоколу
    private PrintWriter logWriter;
    public static int ageGreaterThanOneCounter = 0; // Counter for dogs older than 1
    public static List<Color> dogColorList = new ArrayList<>(); // List to store dog colors


    /**
     * Пустий конструктор без аргументів.
     * Ініціалізує об'єкт Dog та створює файл протоколу.
     */
    //Пустий конструктор без аргументів
    public Dog() {
        try {
            logWriter = new PrintWriter(new FileWriter("D:\\NULP\\KZP\\Lab2\\KI305_Gnidec_Lab2\\doc\\Dog.txt"));
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
            logWriter = new PrintWriter(new FileWriter("D:\\NULP\\KZP\\Lab2\\KI305_Gnidec_Lab2\\doc\\Dog.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (age.getAge() > 1) {
            ageGreaterThanOneCounter++; // Increment counter if age is greater than 1
            dogColorList.add(color); // Save the dog's color into the list
        }

    }

    //Гетери і сетери для об'єктів класу
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }


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

    //Методи для роботи з автомобілемyy
    public void feed() {
        System.out.println("Feed the dog.");
        logActivity("You fed the dog.");//Запис у протокол
    }

    public void pet() {
        System.out.println("Pet the dog.");
        logActivity("You petted the dog.");//Запис у протокол
    }


    public void goForAWalk() {
        System.out.println("Go for a walk with dog.");
        logActivity("You went for a walk with dog");//Запис у протокол
    }

    public void call() {
        System.out.println("Call the dog.");
        logActivity("You called the dog.");//Запис у протокол
    }

    public void tellToWait() {
        System.out.println("Tell the dog to wait patiently.");
        logActivity("You told the dog to wait patiently.");//Запис у протокол
    }

    public void tellToSit() {
        System.out.println("Tell the dog to sit.");
        logActivity("You told the dog to sit.");//Запис у протокол
    }

    public void tellToSpeak() {
        System.out.println("Tell the dog to speak loudly and clearly.");
        logActivity("You told the dog to speak loudly and clearly.");//Запис у протокол
        closeLogFile();//Закриваємо файл при завершенні роботи
    }
    public void spinAroundThroughLeft() {
        System.out.println("Dog spins around through the left side.");
        logActivity("You told the dog to spin around through the left side.");//Запис у протокол
    }

    public void spinAroundThroughRight() {
        System.out.println("Dog spins around through the right side.");
        logActivity("You told the dog to spin around through the right side.");//Запис у протокол
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
