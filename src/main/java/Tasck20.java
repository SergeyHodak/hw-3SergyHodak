/*
    Задание - сколько топлива использовать
    Просто для запуска двигателя и его прогрева мы используем 1000 единиц топлива.
Если мы летим 20 световых лет, или меньше - нам хватит этого топлива. Но если мы
летим больше чем 20 световых лет - то каждый световый год сверх 20 дополнительно
израсходует 5 единиц топлива.
    Напиши программу, которая определит, сколько топлива нам нужно для полета на заданное расстояние.
    Напиши метод public int calculateNeededFuel(int distance). Этот метод считает количество
единиц топлива, которые мы потратим на полет на указанное расстояние.
*/
import java.util.*;

public class Tasck20 {
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
        if ((20 - distance) < 0) {
            return (distance - 20) * 5 + 1000;
        }

        return 1000;
    }

    //Test output
    public static void main(String[] args) {
        Tasck20 ship = new Tasck20();

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
        System.out.println(ship.calculateNeededFuel(21));
    }
}