import java.io.*;
import java.util.*;
import java.io.RandomAccessFile;

/**
 * Клас KI305_Gnidec_Lab1 реалізує програму до лабораторної роботи №1 *
 * @author KI305_Gnidec_Lab1 *
 * @verйsion 1.1
 * @since version 1.0 *
 */
public class KI305_Gnidec_Lab1 {
    /**
     * Статичний метод main є точкою входу в програму *
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        int nRows;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\admin\\Desktop\\Size1.txt", "rw");
        raf.write("6".getBytes());
        raf.close();
        File dataFile = new File("C:\\Users\\admin\\Desktop\\Lab1_Result.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        fout.print(nRows + "\n");
        arr = new char[nRows][];


        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                arr = new char[i+1][j+1];

            }
        }
        System.out.print("\nВведіть символ-заповнювач 1 : ");
        filler = in.nextLine();
        fout.print(filler + "\n");

        exit:
        for (int i = 0; i < nRows; i++)
        {
            for (int j = 0; j < nRows ; j++)
            {
                if (filler.length() == 1)
                {
                    if (i <= j && i + j <= nRows - 1 ){
                        if (j % 2== 1) {
                            arr[i][j] = '.';
                            System.out.print(arr[i][j] + "  ");
                            fout.print(arr[i][j] + "  ");
                        }
                        else{
                            arr[i][j] = (char) filler.codePointAt(0);
                            System.out.print(arr[i][j] + "  ");
                            fout.print(arr[i][j] + "  ");
                        }
                    }
                    else{
                        System.out.print("   ");
                        fout.print("   ");
                    }
                }
                else if (filler.length() == 0)
                {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                }
                else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}