package KI305_Gnidec_Lab4;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Клас <code>EquationsApp</code> реалізує головний драйвер для
 класу Equations.
 * Версія 1.0
 */
public class EquationsApp {
    public static void main(String[] args) {

        out.print("Введіть ім'я файлу: ");

        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        PrintWriter fout = null;

        try {
            fout = new PrintWriter(new File(fName));
            Equations eq = new Equations();

            out.print("Введіть X: ");

            int x = in.nextInt();
            double result = eq.calculate(x);

            fout.print("Результат: " + result);
            fout.flush();
            fout.close();
            out.println("Результат: " + result);
        } catch (FileNotFoundException ex) {
            out.print("Причина винятку: Файл не знайдено");
        } catch (CalcException | TestException ex) {
            out.print(ex.getMessage());
        }
        finally {
            if (fout != null) {
                fout.close();
            }
        }
    }
}