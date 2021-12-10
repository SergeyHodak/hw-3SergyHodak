/*
    Задача - найти минимальное среди трех чисел
    Напиши класс CaptainDisputeAgain. В этом классе создай метод public int findMin(int[] triple).
Он принимает массив из трех целых чисел, и возвращает минимальное из них. Оператор if использовать нельзя.
 */

import java.util.Arrays;

public class Tasck26 {
    public static int findMin(int[] triple) {
        Arrays.sort(triple);
        return  triple[0];
    }
    public static void main(String[] args) {
        Tasck26 captainDispute = new Tasck26();
        System.out.println(findMin(new int[] {1, 10, 3}));
        System.out.println(findMin(new int[] {50, 4, 100}));
    }
}
/*
Примеры тестов
вызов findMin(new int[] {1, 10, 3}) возвращает 1
вызов findMin(new int[] {50, 4, 100}) возвращает 4
 */