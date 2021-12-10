/*
    Задание - тест логических функций
    Напиши метод public void testLogicalOperators(). Он считывает из консоли
три переменные типа boolean. Дальше в консоль, через пробел, выведи:
  результат логической операции И, примененной к этим переменным
  результат логической операции ИЛИ, примененной к этим переменным
 */
import java.util.*;
public class Tasck03 {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }

    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean annd = a & b & c;
        boolean orr = a | b | c;

        System.out.println(annd + " " + orr);

        scanner.close();
    }

    //Тестовый вывод на стандартном вводе true, true, false
    public static void main(String[] args) {
        new Tasck03().testLogicalOperators();
    }
}
// true true false -> false true
// true true true -> true true
// true false true -> false true
// false false false -> false false