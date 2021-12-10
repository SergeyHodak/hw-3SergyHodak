/*
    Задание - звездная лотерея
    Условия лотереи следующие:
если номер билетика делится на 10 - вы выиграли кристалл (слово "crystall")
если номер билетика кончается на цифру 7 - вы выиграли чип (слово "chip")
если номер билетика больше чем 200 - вы выиграли монету (слово "coin")
Понятно, что при таких условиях можно выиграть несколько призов сразу.
    Напиши программу, которая принимает номер билетика, и возвращает строку - выигранные призы.
Каждый выигранный приз должен отделяться ровно одним пробелом. В начале и конце строки пробелов
быть не должно. Если призов несколько, они должны идти в указанном порядке - вначале
"crystall", потом "chip", и в конце "coin".
    Если ты ничего не выиграл - возврати пустую строку.
    Напиши метод public String getMyPrizes(int ticket). Он принимает на вход число - номер
лотерейного билета, и возвращает строку - выигранные призы. Если ничего не выиграл - возвращается пустая строка.
 */
import java.util.*;

public class Tasck22 {
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
        String awards = "";
        int lastDigit = ticket;
        for(int i = 0; lastDigit > 10; i++) {
            lastDigit = lastDigit % 10;
        }

        if (ticket % 10 == 0) {
            if(awards.length() == 0) {
                awards = "crystall";
            } else {
                awards += " crystall";
            }
        }
        if (lastDigit == 7) {
            if(awards.length() == 0) {
                awards = "chip";
            } else {
                awards += " chip";
            }
        }
        if (ticket > 200) {
            if(awards.length() == 0) {
                awards = "coin";
            } else {
                awards += " coin";
            }
        }

        return awards;
    }

    //Test output
    public static void main(String[] args) {
        Tasck22 ship = new Tasck22();

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
    }
}