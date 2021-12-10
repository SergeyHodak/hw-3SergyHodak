/*
    Задание - посчитать цену заправки
    Цена топлива зависит от его марки. Могут быть 3 варианта топлива:
    "STAR100" - базовое топливо, цена 70 минералов за единицу
    "STAR500" - продвинутое топливо, цена 120 минералов за единицу
    "STAR1000" - самое крутое топливо. Цена 200 минералов за единицу.
Если марка топлива любая другая - цена за такое топливо составляет 50 минералов за единицу.
Напиши метод public int calculateFuelPrice(String fuel, int count). Он принимает марку топлива,
и количество требуемых единиц. Возвращает цену топлива согласно заданию выше.
 */

import java.util.*;

public class Tasck18 {
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
        int fuelPrice;
        if (fuel.equals("STAR100")) {
            fuelPrice = 70;
        } else if (fuel.equals("STAR500")) {
            fuelPrice = 120;
        } else if (fuel.equals("STAR1000")) {
            fuelPrice = 200;
        } else {
            fuelPrice = 50;
        }
        return count * fuelPrice;
    }

    //Test output
    public static void main(String[] args) {
        Tasck18 ship = new Tasck18();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));
    }
}