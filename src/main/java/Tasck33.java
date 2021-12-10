/*
    Задание - оставить только правильные цены
Напиши метод public int[] leavePrice9(int[] prices), который возвратит массив из тех цен,
которые оканчиваются на цифру 9. Не изменяй порядок оставшихся цен.
 */

import java.util.*;

public class Tasck33 {
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
        //System.out.println("На вход мы получили = " + Arrays.toString(prices));
        int byHowMuchToShrinkTheArray = 0;
        for(int price: prices) {
            if (price < 10) {
                if (price == 9) {
                    byHowMuchToShrinkTheArray++;
                }
            } else {
                //System.out.println("Здесь цена больше чем от 0 до 9 = " + price);
                int ten = price;
                for (;;) {
                    ten %= 10;
                    //System.out.println("price % 10 = " + ten);
                    if (ten < 10) {
                        if (ten == 9) {
                            byHowMuchToShrinkTheArray++;
                        }

                        break;
                    }
                }
            }
        }

        //System.out.println("В этом массиве наша программа нашла цен с девятками = " + byHowMuchToShrinkTheArray);

        int[] result1 = new int[byHowMuchToShrinkTheArray];
        int num1 = 0;
        for(int price: prices) {
            if (price < 10) {
                if (price == 9) {
                    result1[num1] = price;
                    num1++;
                }
            } else {
                int ten1 = price;
                for (;;) {
                    ten1 %= 10;
                    if (ten1 < 10) {
                        if (ten1 == 9) {
                            result1[num1] = price;
                            num1++;
                        }

                        break;
                    }
                }
            }
        }
        return result1;
    }

    //Test output
    public static void main(String[] args) {
        Tasck33 shop = new Tasck33();

        //Should be [1599, 399]
        int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
    }
}
/*
    Примеры тестов
вызов leavePrice9(new int[] {1, 99, 5, 49}) возвращает [99, 49]
вызов leavePrice9(new int[] {}) возвращает []
использовать можно только цикл for
 */