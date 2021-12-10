/*
    Задание - обработка возрастов граждан
    Напиши метод public int[] createAgeArray(int age1, int age2, int age3, int age4).
Он принимает 4 целых числа, и возвращает их же, но в виде массива. Используй синтаксис
инициализации массива с помощью фигурных скобок {}.
 */

import java.util.*;

public class Tasck06 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public static void main(String[] args) {
        int[] ageArray = new Tasck06().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
    }
}