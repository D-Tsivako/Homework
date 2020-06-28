import java.util.Scanner;
/** 
 * ����� ����� �� �������� <b>length</b>.
 * @autor ����� ������
 * @version 2.1
*/
public class Array {
    public static void main(String[] args) {
    	System.out.print("������� ����� ������ ����� ������ �����: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longNumber = "", shortNumber = line;
        /** 
         * ���� ����������� ������ ��������� � ������ �������� �����
         */
        for (String s : line.split(" ")) {
            if (s.length() > longNumber.length()) longNumber = s;
            if (s.length() < shortNumber.length()) shortNumber = s;
        }
        /** 
         * ����� ��������� ����������
         */
        System.out.println("����� ������� �����: " + longNumber);
        System.out.println("�����: " + longNumber.length());
        System.out.println("����� �������� �����: " + shortNumber);
        System.out.println("�����: " + shortNumber.length());
    }
}