import java.util.Scanner;
/**
 * 15.02.2020
 * 17.04.2020
 * 10.02
 * Класс Числа со свойствм <b>length</b>.
 * @autor Дарья Цивако
 * @version 2.1
 */
public class Numbers {
    public static void main(String[] args) {
        System.out.print("Введите через пробел числа разной длины: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longNumber = "", shortNumber = line;
        /**
         * Цикл определения самого короткого и самого длинного числа
         */
        for (String s : line.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        /**
         * Вывод конечного результата
         */
        System.out.println("Самое длинное число: " + longNumber);
        System.out.println("Длина: " + longNumber.length());
        System.out.println("Самое короткое число: " + shortNumber);
        System.out.println("Длина: " + shortNumber.length());
    }
}
