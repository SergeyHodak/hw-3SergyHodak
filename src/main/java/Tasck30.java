/*
    Задание - найти наибольшую и наименьшую цену
    Напиши метод public int[] findMinMaxPrices(int[] prices). Он принимает массив цен, и возвращает новый массив, который:
пустой, если переданный массив prices - пустой
из одного элемента, если в массиве prices максимальная и минимальная цена одинаковы
из двух элементов, если в массиве prices есть и минимальная, и максимальная цены.
Вначале должна идти минимальная цена, потом максимальная.
 */

import java.util.*;

public class Tasck30 {
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
        if (prices.length < 2) {return prices;}
        int max = prices[0];
        int min = prices[0];

        for(int i = 0; i < prices.length; i++) {
            if (max < prices[i]) {max = prices[i];}
            if (min > prices[i]) {min = prices[i];}
        }
        if (max == min) {return new int[] {max};}
        return new int[] {min, max};
    }

    //Test output
    public static void main(String[] args) {
        Tasck30 shop = new Tasck30();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[0])));
    }

}

/*
Примеры тестов
вызов findMaxPrices(new float[] {10, 50, 3, 1550}) возвращает [3, 1550]
вызов findMaxPrices(new float[] {}) возвращает []
вызов findMaxPrices(new float[] {50, 50}) возвращает [50]
использовать можно только цикл for
 */