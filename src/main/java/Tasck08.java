/*
    Задание - выборы мэра
    Напиши метод public String firstAndLastTogether(String[] names). Он принимает
массив ровно из 10 строк, и возвращает первую и последнюю строку, соединенные строкой
" AND ", и в конце добавляется слово "TOGETHER". Между всеми словами должен быть ровно один пробел.
 */

public class Tasck08 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    public static void main(String[] args) {
        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new Tasck08().firstAndLastTogether(names));
    }
}

//вызов firstAndLastTogether на массиве ["io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"] возвращает "io AND rew TOGETHER"