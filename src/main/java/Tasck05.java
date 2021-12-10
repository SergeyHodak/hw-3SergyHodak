/*
    Задание - город Харэк, планета Хьярг
    Допиши метод createEmptyNameArray() так, чтобы переменная result инициализировалась пустым массивом.
 */

import java.util.*;

public class Tasck05 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new Tasck05().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));
    }
}