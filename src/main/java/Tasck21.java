/*
    Задание - посчитать мощность двигателя
    Напиши метод public void calculateMaxPower(). Он считывает с консоли 3 числа - мощности двигателей.
Ищет самый мощный двигатель, умножает его на нужный коэффициент (ниже описано как его искать), и выводит
результат в консоль.
    если мощность меньше, чем 10 единиц - коэффициент 0.7f
    если мощность от 10 до 100 единиц включительно - коэффициент 1.2f
    если мощность больше 100 единиц - коэффициент 2.1f
 */

import java.util.*;

public class Tasck21 {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 1000;
        return 1000 + extraDistance * 5;
    }

    void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int powerfulEngine = 0;
        if ((a >= b) & (a >= c)) {powerfulEngine = a;}
        if ((b >= a) & (b >= c)) {powerfulEngine = b;}
        if ((c >= a) & (c >= b)) {powerfulEngine = c;}

        if (powerfulEngine < 10) {System.out.println(powerfulEngine * 0.7f);}
        if ((powerfulEngine > 9) & (powerfulEngine <= 100)) {System.out.println(powerfulEngine * 1.2f);}
        if (powerfulEngine > 100) {System.out.println(powerfulEngine * 2.1f);}
        scanner.close();
    }

    //Test output
    public static void main(String[] args) {
        Tasck21 ship = new Tasck21();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();
    }
}