/*
    Задание - нарисовать паттерн
    Напиши метод public String drawPattern(char[] pattern, int repeatCount), который принимает
образец для отрисовки - pattern, и количество раз, которое нужно подряд нарисовать этот образец repeatCount.
Метод возвращает строку с нарисованным указанное количество раз образцом.
 */

public class Tasck40 {
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

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        while (repeatCount > 0) {
            int i = 0;
            while (i < pattern.length) {
                result += pattern[i];
                i++;
            }
            repeatCount--;
        }
        return result;
    }

    public static void main(String[] args) {
        Tasck40 helper = new Tasck40();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
/*
    Примеры тестов
Выполнение кода:
System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
выведет в консоль:

JavaJavaJava
использовать можно только цикл while
 */