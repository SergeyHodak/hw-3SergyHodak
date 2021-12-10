/*
    Задание - выбираем куда лететь
    Напиши метод public String choosePlanet(long distanceToEarth). Он возвращает название планеты,
куда мы летим. Возвращается "Earth", если переданное расстояние меньше чем 45677.
Во всех остальных случаях возвращается Pern.
 */

import java.util.*;

public class Tasck17 {
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
        return distanceToEarth < 45677 ? "Earth" : "Pern";
    }

    //Test output
    public static void main(String[] args) {
        Tasck17 ship = new Tasck17();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));
    }
}