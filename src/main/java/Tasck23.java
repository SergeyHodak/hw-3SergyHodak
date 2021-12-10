/*
    Задание - куда поставить ракету
    О каждом ангаре нам известны его размеры (ширина и длина в метрах), и стоимость аренды всего ангара в долларах.
    Ангар, где будет стоять ракета, считается подходящим, если:
его площадь составляет не меньше 1500 квадратных метров
более длинная сторона не больше, чем в два раза, за более короткую сторону (нам не нужны длинные и узкие ангары)
цена квадратного метра ангара не больше 1000 долларов в сутки
    Напиши программу, которая будет определять, подходит ли ангар для ракеты, на которой ты летишь.
    Задание
    Напиши метод public boolean isHangarOk(int side1, int side2, int price).
Он принимает две стороны ангара (side1 и side2, причем порядок может быть любой - вначале большая
потом меньшая, и наоборот), и цену за аренду всего ангара в сутки. Тебе нужно понять, подходит ли ангар,
по критериям описанным выше. Если подходит - возврати true, и возврати false в противном случае.
 */

import java.util.*;

public class Tasck23 {
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

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        boolean hangarArea = (side1 * side2) >= 1500;
        boolean spaciousHangar = side1 > side2 ? (side1 <=side2 * 2) : (side2 <= side1 * 2);
        boolean hangarPrice = price / (side1 * side2) <= 1000;
        return hangarArea & spaciousHangar & hangarPrice;
    }

    //Test output
    public static void main(String[] args) {
        Tasck23 ship = new Tasck23();

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

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}