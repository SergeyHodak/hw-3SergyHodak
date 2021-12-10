/*
    Задание - нарисовать линию
Напиши метод public String drawLine(int length). Он рисует линию длиной length символами '*' и '#' поочередно,
начиная c символа '*' и возвращает эту линию.
 */

public class Tasck39 {
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

        int lines = height;

        while(lines > 0) {
            lines--;

            int columns = width;
            while(columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawLine(int length) {
        String result = "";
        int i = 1;
        while (i <= length) {
            if (i % 2 == 0) {
                result += "#";
                i++;
            } else {
                result += "*";
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Tasck39 helper = new Tasck39();
        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));
    }
}
/*
    Примеры тестов
Выполнение кода:
System.out.println(helper.drawLine(5));
выведет в консоль:

*#*#*
использовать можно только цикл while
 */