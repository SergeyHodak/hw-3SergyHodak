/*
    Задание - прочитать строку и вывести ее в консоль
    Кто-то до тебя уже написал заглушку метода testBasicInputOutput,
и создал там объект для чтения данных из консоли, назвав его scanner.
    Допиши код так, чтобы он считывал одну строку (до переноса на
новую строку), и выводил этот же текст в консоль. Не забудь в конце
освободить память, вызвав метод scanner.close().
 */
import java.sql.SQLOutput;
import java.util.*;
public class Tasck01 {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
    //Тестовый вывод на стандартном вводе Hello Java
    public static void main(String[] args) {
        Tasck01 computerTests = new Tasck01();
        computerTests.testBasicInputOutput();
    }
}
//Hello Java