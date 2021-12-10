/*
    Задание - исправить имена
    Напиши метод public void fixNames(String[] names, String[] toReplace). Он заменяет значения
в массиве names по нечетным индексам на значения из массива toReplace.
Длина массива names всегда 5. Длина массива toReplace всегда 2.
 */

import java.util.*;

public class Tasck07 {
    public String[] createEmptyNameArray() {
        return new String[0];
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new Tasck07().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }
}