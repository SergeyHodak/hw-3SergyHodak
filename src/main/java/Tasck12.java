/*
    Задание - вывести клавиатуру на экран
    Напиши метод public void printKeyboard(). Он выводит в консоль клавиатуру,
которую ты раньше писал (метод createKeyboard()), каждый массив - на отдельной строке.
Используй написанный ранее метод createKeyboard() для получения клавиатуры.
Используй метод Arrays.toString() для вывода отдельных массивов.
 */

import java.util.*;

public class Tasck12 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[] {
                results[2],
                results[3],
                results[4]
        };
    }

    public char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
    }

    public static void main(String[] args) {
        new Tasck12().printKeyboard();
    }
}