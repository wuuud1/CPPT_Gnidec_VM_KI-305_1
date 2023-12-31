package KI305_Gnidec_Lab3;


/**
 * Інтерфейс, що представляє команди для собаки.
 * Реалізуючі класи повинні реалізовувати методи цього інтерфейсу для вказування команд і надавати інформацію про їх стан.
 */
public interface Movements {

    /**
     * Встановлює команду для собаки(сидіти або стояти).
     *
     * @param data true, якщо собака повинна сидіти, false, якщо собака повинна стояти.
     */

    void setSitOrStay(boolean data);

    /**
     * Виводить інформацію про поточний стан собачки.
     */
    void sitOrStayInfo();
}
