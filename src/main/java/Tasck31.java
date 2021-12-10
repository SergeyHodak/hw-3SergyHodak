/*
    Задание - сколько есть цен
    Напиши метод public int getMinPriceCount(int[] prices), который принимает массив цен, и возвращает:
0, если переданный массив - пустой
количество минимальных цен. Если все цены одинаковы - то возврати размер массива
 */

import java.util.*;

public class Tasck31 {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for(int price: prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[] {min};
        }

        return new int[] {min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int price: prices) {
            if (min > price) { min = price;}
        }

        int numberOfRepetitions = 0;
        for (int price: prices) {
            if (min == price) {numberOfRepetitions++;}
        }

        return numberOfRepetitions;
    }

    //Test output
    public static void main(String[] args) {
        Tasck31 shop = new Tasck31();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices)); //Should be 2
    }
}
/*
    Примеры тестов
вызов getMinPriceCount(new int[] {}) возвращает 0
вызов getMinPriceCount(new int[] {5, 5, 5}) возвращает 3
вызов getMinPriceCount(new int[] {5, 10, 15, 3, 5}) возвращает 1
использовать можно только цикл for
 */