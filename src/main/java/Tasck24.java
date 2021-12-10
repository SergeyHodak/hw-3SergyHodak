/*
    Задача - приземление
    Квадратное уравнение - это уравнение вида ax^2 + bx + c = 0. У такого уравнения может быть 0, 1 или два корня.
    Соответственно, решением уравнения будет массив корней - он может быть пустым, содержать одно число, или два числа
    Если забыл как решать такие уравнения - поищи в интернете. Нужно будет искать дискриминант,
и в зависимости от этого ты поймешь сколько есть корней.
    Напиши класс QuadraticEquationSolver. В этом классе создай метод public double[] solve(int a, int b, int c).
    Этот метод принимает коэффициенты квадратного уравнения, и возвращает один из трех вариантов:
пустой массив, если корней нет
массив из одного элемента, если есть всего лишь один корень
массив из двух элементов (вначале больший, потом меньший), если корней два
*/

import java.util.Arrays;

public class Tasck24 {
    public static double[] solve(int a, int b, int c) {
        int discriminant = b*b - 4*a*c;
        if (discriminant < 0) {
            return new double[0];
        }
        if (discriminant == 0) {
            return new double[]{(-b + Math.sqrt(discriminant)) / (2 * a)};
        }
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{Math.max(x1, x2), Math.min(x1, x2)};
    }

    public static void main(String[] args) {
        Tasck23 ship = new Tasck23();
        System.out.println(Arrays.toString(solve(1, -2, -3)));
        System.out.println(Arrays.toString(solve(1, 12, 36)));
        System.out.println(Arrays.toString(solve(5, 3, 7)));
    }
}

/*
    Примеры тестов
вызов solve(1, -2, -3) возвращает массив [3.0, -1.0]
вызов solve(1, 12, 36) возвращает массив [-6]
вызов solve(5, 3, 7) возвращает пустой массив []
 */