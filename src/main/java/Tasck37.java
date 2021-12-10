/*
    Задание - нарисовать квадрат
    Java не позволяет использовать тебе цикл for - только цикл while.
Напиши метод public String drawQuad(int n), который рисует символами '*' квадрат со стороной n.
 */

public class Tasck37 {
    public String drawQuad(int n) {
        int i = 0;
        String result = "";
        while (i < n) {
            result = result + "*";
            i++;
        }

        int j = 0;
        while (j < n) {
            System.out.println(result);
            j++;
        }
        return "";
    }

    //Test output
    public static void main(String[] args) {
        Tasck37 helper = new Tasck37();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}
/*
Выполнение кода: System.out.println(helper.drawQuad(2));
выведет в консоль:
**
**

 */