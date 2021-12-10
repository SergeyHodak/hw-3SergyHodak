/*
    Задача - сделать набор дешевых товаров
Напиши класс CheapStocks. Создай в нем метод public String getCheapStocks(String[] stocks).
Он принимает на вход массив строк. Каждая строка состоит из названия товара, и его цены, разделенных одним пробелом.
Метод возвращает строку - список названий товаров, цена которых меньше чем 200.

В решении этой задачи тебе поможет метод split() класса String, который разделит строку на две части по пробелу.
А чтобы перевести строку в число, ты можешь использовать статический метод Integer.parseInt(). Например:

String text = "123 456";
String[] parts = text.split(" ");
int number1 = Integer.parseInt(parts[0]); //123
int number2 = Integer.parseInt(parts[1]); //456
 */

public class Tasck36 {
    public String getCheapStocks(String[] stocks) {
        String[] name = new String[stocks.length];
        int[] price = new int[stocks.length];
        for (int i = 0; i < stocks.length; i++) {
            String[] parts = stocks[i].split(" ");
            name[i] = parts[0];
            price[i] = Integer.parseInt(parts[1]);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stocks.length; i++) {
            if (price[i] < 200) {
                if (result.toString().equals("")){
                    result.append(name[i]);
                } else {
                    result.append(" ").append(name[i]);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Tasck36 test = new Tasck36();
        System.out.println(test.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200"}));
    }

}
/*
    Примеры тестов
вызов getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}) возвращает "firebow"
использовать можно только цикл for
 */