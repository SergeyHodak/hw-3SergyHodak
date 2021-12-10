/*
    Задание - результаты выборов
    Напиши метод public void changeElectResult(String[] results).
Он принимает массив строк, и меняет местами первую и последнюю строки.
Гарантируется, что длина массива всегда не меньше 1 элемента.
 */

import java.util.*;

public class Tasck09 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        if (results.length > 1) {
            String[] arrTarget = Arrays.copyOf(results, results.length);
            results[0] = arrTarget[arrTarget.length - 1];
            results[results.length - 1] = arrTarget[0];
        }
    }

    public static void main(String[] args) {
        String[] results = new String[]{"miho", "hut"};
        new Tasck09().changeElectResult(results);
        System.out.println(Arrays.toString(results));
    }
}
// ["miho", "hut"] -> ["hut", "miho"]
// ["igo"] -> ["igo"]