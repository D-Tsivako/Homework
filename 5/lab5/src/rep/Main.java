package rep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Notepad note1 = new Notepad("19/05/20", "20/05/20");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить событие");
            System.out.println("2. Вывести все записи");
            System.out.println("3. Удалить событие ");
            System.out.println("4. Анонимный класс");
            System.out.println("5. Выход");

            int code = in.nextInt();
            switch (code) {
                case 1: System.out.println("Введите название события, описание, локацию");
                    String s1 = in.nextLine();
                    String s2 = in.nextLine();
                    String s3 = in.nextLine();
                    note1.setEvent(s1, s2, s3);
                    break;
                case 2:
                    System.out.println(note1);
                    note1.printEvent();
                    break;
                case 3:
                    System.out.println("Введите номер события, которое хотите удалить ");
                    int n = in.nextInt();
                    note1.removeEvent(n);
                    break;
                case 4:
                    Notepad note2 = new Notepad(){
                        @Override
                        public void printEvent() {
                            StringBuilder printInfo = new StringBuilder();

                            System.out.println("Hello ");
                        }
                    };
                    note2.printEvent();
                    break;
                case 5:
                    return;
                default:
            }
        }
    }

}

