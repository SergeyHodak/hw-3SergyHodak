/*
    Задание - убрать низкие цены
Напиши метод public int[] removePrice(int[] prices, int toRemove). Он удаляет из массива prices
все вхождения цены toRemove, и возвращает новый массив без указанной цены.
 */
import java.util.*;

public class Tasck32 {
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
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int num = 0; //узнать сколько в массиве удаляемых элементов
        for (int price: prices) {
            if (price == toRemove) {num++;}
        }

        int[] result = new int[prices.length - num]; //уменшенный массив
        int a = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[a] = prices[i];
                a++;
            }
        }

        return result;
    }

    //Test output
    public static void main(String[] args) {
        Tasck32 shop = new Tasck32();

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
        System.out.println(Arrays.toString(shop.removePrice(new int[] {100, 100, 100}, 0)));
    }
}
/*
    Примеры тестов
вызов removePrice(new int[] {150, 100, 200}, 100) возвращает [150, 200]
вызов removePrice(new int[] {100, 100, 100}) возвращает []  <- компилятор не пропустит такой запросс
использовать можно только цикл for
 */

/*
Метод removePrice для входных данных [6, 0, 5, 8, 3, 9, 0, 5, 5, 5], 0 возвращает неправильное значение [] , а должен возвращать [6, 5, 8, 3, 9, 5, 5, 5]
 */