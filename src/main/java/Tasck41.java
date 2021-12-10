/*
    Задача - нарисовать прямоугольный треугольник
    Напиши класс TriangleDrawer. Создай в нем метод public String drawTriangle(int side).
Он принимает размер стороны треугольника, рисует этот треугольник в строку, и возвращает эту строку.

    Обрати внимание на аккуратный вывод, лишние пробелы после символов '*' не допускаются.
Подсказка. Чтобы вывести указанное количество раз нужную строку, есть метод repeat().
Он берет строку, у которой был вызван этот метод, и возращает ее же, скопированную указанное количество раз.
Этот метод можно вызывать не только у переменной, а и прямо у строки:

System.out.println("*".repeat(3)); //***
 */

public class Tasck41 {
    public String drawTriangle(int side) {
        String result = "";
        int i = side;
        while (i != 0) {
            result += "*".repeat(i);
            i--;
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Tasck41().drawTriangle(3));
    }

}

/*
    Примеры тестов
Выполнение кода:
System.out.println(new TriangleDrawer().drawTriangle(3));
выведет в консоль:
***
**
*
использовать можно только цикл while
 */