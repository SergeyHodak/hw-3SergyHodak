/*
    Задание - разбить число на массив цифр
Напиши метод public int countSumOfDigits(int number). Он принимает число, и возвращает сумму цифр этого числа.
 */

public class Tasck43 {
    public int countSumOfDigits(int number) {
        int result = 0;
        int a = number;
        while (true) {
            if (("" + a).length() > 1) {
                result += a%10;
                a /= 10;
            } else {
                result += a;
                break;
            }
        }
        return result;
    }

    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public static void main(String[] args) {
        Tasck43 bank = new Tasck43();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}

/*
    Примеры тестов
вызов countSumOfDigits(99) возвращает 18
вызов countSumOfDigits(111) возвращает 3
использовать можно только цикл while
 */