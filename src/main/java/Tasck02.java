/*
    Задание - тест математических функций
    Напиши метод public void testMath(). Метод считывает с консоли два целых числа,
и выводит в консоль, через пробел, 4 числа - сумму, разницу, произведение и частное
(используй целочисленное деление).
    Гарантируется, что оба прочитанных числа не равны 0.
 */
import java.util.*;
public class Tasck02 {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((x + y) + " " + (x - y) + " " + (x * y) + " " + (x / y));
        scanner.close();
    }

    //Тестовый выход на 24, 4 стандартных входа
    public static void main(String[] args) {
        new Tasck02().testMath();
    }
}
//24 4 = 28 20 96 6
// 5 4 = 9 1 20 1
//1 100 = 101 -99 100 0