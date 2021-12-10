/*
    Задание - нарисовать прямоугольник
    Напиши метод public String drawRect(int width, int height, char c), который нарисует символом c прямогольник,
у которого height строк, каждая строка имеет width символов.
 */

public class Tasck38 {
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int a = height;
        while(a > 0) {
            a--;
            int b = width;
            while(b > 0) {
                result += c;
                b--;
            }
            result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        Tasck38 helper = new Tasck38();
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}
/*
Примеры тестов
Выполнение кода:
ArlanHelper helper = new ArlanHelper();
System.out.println(helper.drawRect(2, 3, 'X'));
выведет в консоль:

XX
XX
XX
использовать можно только цикл while
 */