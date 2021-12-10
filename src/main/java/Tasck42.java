/*
    Задание посчитать сумму квадратов чисел
Напиши метод public int sumQuads(int n), который считает и возвращает сумму квадратов чисел от 1 до n включительно.
 */

public class Tasck42 {
    public int sumQuads(int n) {
        int result = 0;
        int i = 1;
        while (i <= n) {
            result += (i*i);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Tasck42 bank = new Tasck42();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}

/*
    Примеры тестов
вызов sumQuads(3) возвращает 14
вызов sumQuads(1) возвращает 1
использовать можно только цикл while
 */