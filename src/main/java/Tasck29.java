/*
    Задание - поднять цены
Напиши метод public void multiplyPrices(float[] prices). Он принимает массив цен,
и умножает каждую цену на 2, если цена меньше 1000, и на 1.5, если цена больше или равна 1000.
 */

import java.util.*;

public class Tasck29 {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            prices[i] = (prices[i] < 1000f) ? (prices[i] * 2f) : (prices[i] * 1.5f);
        }
    }

    //Test output
    public static void main(String[] args) {
        Tasck29 shop = new Tasck29();

        //Should be [200, 2250]
        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}
/*
Примеры тестов
вызов multiplyPrices() на данных [100, 1500] должен менять переданный массив на [200, 2250]
использовать можно только цикл for
 */