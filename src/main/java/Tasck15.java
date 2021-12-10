/*
    Задание - определить расстояние
    Напиши метод public int calculateDistance(int distance). Метод принимает расстояние,
и возвращает его же, если оно положительное. Если же расстояние отрицательное - возвращается
модуль этого расстояния.
 */


public class Tasck15 {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return Math.abs(distance);
        } else {
            return distance;
        }
    }


    //Test output
    public static void main(String[] args) {
        Tasck15 ship = new Tasck15();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}