/*
    Задание - определить ближайшие планеты
    Напиши метод public String[] getPlanets(String galaxy). Он принимает на вход
строку - название галактики, и возвращает список планет в галактике, как приведено ниже:
    Miaru - и планеты в ней - Maux, Reux, Piax
    Milkyway и планеты в ней Earth, Mars, Jupiter
    DangerBanger и планеты в ней - Fobius, Demius
Если имя галактики неизвестное, программа должна возвратить пустой массив
 */

import java.util.*;

public class Tasck16 {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }
        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    //Test output
    public static void main(String[] args) {
        Tasck16 ship = new Tasck16();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}