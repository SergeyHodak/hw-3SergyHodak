/*
    Напиши класс HarekDataMaker. В этом методe создай следующие методы:
    public String aggregateSingle(String name, String age, String planet). Он принимает имя,
возраст и планету, и возвращает строку с этими данными в формате:
"name - <NAME>, age - <AGE>, planet - <MARS>"
    public String[] aggregateAll(String[] names, int[] ages, String[] planets). Он принимает
три массива, в каждом из которых три элемента. Первый массив - это имена, второй - возрасты,
третий - планеты. Возвращает массив агрегированных строк. Обязательно используй для агрегации
отдельных строк метод aggregateSingle().
    Размер каждого из массивов, который передается в метод aggregateAll() - ровно 3 элемента.
    Обрати внимание на правильное форматирование данных - пробелы, запятые, переносы строк.
Все это - важные мелочи.
*/

import java.util.Arrays;

public class Tasck14 {
    public String aggregateSingle(String name, String age, String planet) {
        return  "name - " + name +", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        return new String[] {aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]),
                aggregateSingle(names[1], Integer.toString(ages[1]), planets[1]),
                aggregateSingle(names[2], Integer.toString(ages[2]), planets[2])};
    }


    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        Tasck14 harekDataMaker = new Tasck14();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}

