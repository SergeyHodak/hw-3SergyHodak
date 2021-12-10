/*
    Задача - прочитать имя, фамилию, возраст человека
    Напиши класс PassportFormCreator. В этом классе создай метод public void createForms(). Он должен:
* прочитать имя, фамилию и возраст в годах гражданина. Каждый элемент считывается из новой строки
* перевести возраст в годах в возраст в месяцах (учти, что на Луне один год - это 10 месяцев)
* вывести имя, фамилию и возраст в лунных месяцах через пробел в одной строке
* на другой строке вывести имя, фамилию и возраст в лунных месяцах, каждый показатель - на отдельной строке.
  При этом имя и фамилия должны быть в верхнем регистре.
 */

import java.util.Scanner;

public class Tasck04 {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt() * 10;

        System.out.println(name + " " + surname + " " + age);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(age);

        scanner.close();
    }

    public static void main(String[] args) {
        new Tasck04().createForms();
    }
}
// задаем
/*
Evan
Earthfan
15
 */

//получаем
/*
Evan Earthfan 150
EVAN
EARTHFAN
150
 */