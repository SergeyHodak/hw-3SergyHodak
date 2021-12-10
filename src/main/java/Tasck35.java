/*
    Задание - посчитать сумму цен
Напиши метод public int getPricesSum(int[] prices, int minPrice, int maxPrice). Он принимает список цен,
и суммирует их, включая лишь те, которые больше чем minPrice (включительно) и меньше чем maxPrice
(включительно)и возвращает сумму.
 */

import java.util.*;

public class Tasck35 {
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
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for(int price: prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for(String stock: showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for(String stock: warehouseStocks) {
            result[index] = stock;
            index++;
        }

        return result;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int pr: prices) {
            if (pr > minPrice & pr <= maxPrice) {
                sum += pr;
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        Tasck35 shop = new Tasck35();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50)); //124
    }
}

/*
    Примеры тестов
вызов getPricesSum(new int[] {10, 700, 50, 500}, 10, 50) возвращает 60
вызов getPricesSum(new int[] {500, 400, 200}, 10, 50) возвращает 0
использовать можно только цикл for
 */