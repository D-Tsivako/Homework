import java.util.*;
public class Run {

    public static void main(String[] args) {
        System.out.print("Строка: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.print("Номер символа: ");
        int k = s.nextInt();
        String temp;
        String[] words = str.split("[\\s\\.\\!\\,]");
        for (int l = 0; l < words.length; l++) {
            System.out.print("");

            if (k < words[l].length()) {
                temp = "";
                temp += words[l].substring(0, k - 1);
                temp += '@';
                temp += words[l].substring(k, words[l].length());

                words[l] = temp;
            }
            System.out.print(" " + words[l]);

        }
    }
}