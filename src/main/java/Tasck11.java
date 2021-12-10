/*
    Задание - цифровая клавиатура
    Напиши метод public char[][] createKeyboard(). Он возвращает массив из 4-х массивов.
Каждый из этих 4-х массивов состоит из 3-х символов в следующем порядке:
    ['1', '2', '3'] - первый массив
    ['4', '5', '6'] - второй массив
    ['7', '8', '9'] - третий массив
    ['*', '0', '#'] - третий массив
 */

import java.util.*;

public class Tasck11 {
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
        return new String[] {results[2], results[3], results[4]};
    }

    public char[][] createKeyboard() {
        char[][] cKeyboard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};
        return cKeyboard;
    }

    public static void main(String[] args) {
        char[][] keyboard = new Tasck11().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
    }
}

//каждый вызов createKeyboard() возвращает массив из 4-х массивов, описанных выше.