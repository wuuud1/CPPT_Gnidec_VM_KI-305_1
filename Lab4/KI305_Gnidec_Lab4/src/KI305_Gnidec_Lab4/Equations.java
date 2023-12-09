package KI305_Gnidec_Lab4;

/**
 * Клас <code>Equations</code> реалізує метод для обчислення
 виразу ((sin(x) / cos(x)).
 * Автор: [Гнідець Володимир]
 * Версія 1.2
 */
public class Equations {
    /**
     * Метод обчислює вираз ((sin(x) / cos(x)).
     *
     * @param x Значення X, для якого проводиться обчислення.
     * @return Результат обчислення виразу ((sin(x) / cos(x)).
     * @throws CalcException якщо під час обчислення виникає
    виняток.
     */
    /**public double checkForNumber(int x) throws TypeException {
        try {

            if (x == 3)
            {
                return x;
            }
            else {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException ex1) {
                throw new CalcException("Причина винятку: Некоректне значення X. Він повинен бути числом");

        }

    }*/
    public double calculate(int x) throws CalcException, TestException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = Math.sin(rad) / Math.cos(rad);

            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90)
            {
                throw new ArithmeticException();
            }
        }
        catch (CalcException | TestException ex) {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0){
                throw new CalcException("Error");
            }
            else {
                throw new CalcException("Another error");
            }

            /*if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0) {
                throw new CalcException("Причина винятку: Некоректне значення X для обчислення тангенсу");
            }
            else {
                throw new CalcException("Невідома причина винятку під час обчислення виразу");
            }*/
        }
        return y;
    }
}
