/*
    Задание - спор с капитаном
    Капитан звездолета возомнил себя великим программистом. Он считает, что невозможно написать программу,
которая бы могла принять целое число, и возвратить "even" или "odd" без использования оператора if.
Похоже, он не знает про существование тернарного оператора.
Ты поспорил на 2 франка Юпитера, что напишешь такую программу
Задание
Капитан уже написал метод public String evenOrOdd(int number) с использованием if...else.
Перепиши метод так, чтобы он работал как и раньше, но используй только тернарный оператор.
Использование if запрещено.
 */
public class Tasck25 {
    public String evenOrOdd(int number) {
        return number%2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        Tasck25 captainDispute = new Tasck25();

        //Should be even
        System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));
    }
}
/*
    Примеры тестов
вызов evenOrOdd(10) возвращает "even"
вызов evenOrOdd(5) возвращает "true"
не используется оператор if
 */