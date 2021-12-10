/*
    Задание - вывести все цены
    Напиши метод public void printPrices(float[] prices). Он принимает массив цен,
и выводит каждую цену в консоль на отдельной строке, добавляя после каждой цены через пробел слово "jup.".
Используй только цикл for.
 */

public class Tasck28 {
    public void printPrices(float[] prices) {
        int num = prices.length;
        for(int i = 0; i < num; i++) {
            System.out.println(prices[i] + " jup.");}
    }

    //Test output
    public static void main(String[] args) {
        Tasck28 shop = new Tasck28();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}
/*
Тесты
вызов printPrices(new float[] {100f, 23.5f}) напечатает в консоль:
100 jup.
23.5 jup.
 */