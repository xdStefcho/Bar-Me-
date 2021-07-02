package com.dom.Homework16;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        personLocation();

    }

    private static void personLocation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Въведете локацията си ");
        int n = input.nextInt();
        System.out.println("Изберете опция: СПИСЪК ВСИЧКИ (1), СПИСЪК ОТВОРЕНИ (2), КАРТА (3)\n");
        int option = input.nextInt();
        if (option == 1) {
            locations(n);
        }
        else if(option == 2){
            printOpenBars();
        }
        else if(option == 3){
            map(n);
        }
    }

    public static void locations(int n) {
        int[] intArray;
        intArray = new int[10];
        intArray[1] = 350 - n;
        intArray[0] = 200 - n;
        intArray[3] = 700 - n;
        intArray[4] = 750 - n;
        intArray[2] = 500 - n;
        intArray[5] = 800 - n;
        intArray[6] = 1050 - n;
        intArray[7] = 1150 - n;
        intArray[8] = 1400 - n;
        intArray[9] = 1600 - n;

        System.out.println("Блек Лабел (00:00 - 06:00) " + intArray[0] + "м");
        System.out.println("Централ (08:00 - 22:30 ) " + intArray[1] + "м");
        System.out.println("Захира  (08:30 - 23:00 ) " + intArray[2] + "м");
        System.out.println("Клеопатра (00:00 - 05:00 ) " + intArray[3] + "м");
        System.out.println("ЛаБелла  (13:00 - 00:00 ) " + intArray[4] + "м");
        System.out.println("Коктайл Бар (10:00 - 22:00 ) " + intArray[5] + "м");
        System.out.println("Пиано Бар  (22:00 - 04:00 ) " + intArray[6] + "м");
        System.out.println("Рок Бар  (12:00 - 04:00 ) " + intArray[7] + "м");
        System.out.println("Грил Бар (12:00 - 22:00 ) " + intArray[8] + "м");
        System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) " + intArray[9] + "м");

    }

    private static void printOpenBars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("За колко часът искате да видите отворените барове ");
        double openBars = scanner.nextDouble();
        System.out.println("Ето ви списъка ");
        printOpenBar(openBars);
    }
        public static void printOpenBar(double openBars){
            if (openBars <= 22.00 && openBars >= 08.00) {
                System.out.println("Коктайл Бар (10:00 - 22:00 ) ");
                System.out.println("Грил Бар (12:00 - 22:00 ) ");
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (10:00 - 00:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");

            } else if (openBars <= 22.30 && openBars >= 20.00) {
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (10:00 - 00:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");
            } else if (openBars <= 23.00 && openBars >= 22.30) {
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (13:00 - 00:00 ) ");
                System.out.println("Пиано Бар  (22:00 - 04:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");

            } else if (openBars <= 23.30 && openBars >= 23.00) {
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (13:00 - 00:00 ) ");
                System.out.println("Пиано Бар  (22:00 - 04:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");

            } else if (openBars <= 00.00 && openBars >= 23.30) {
                System.out.println("ЛаБелла  (13:00 - 00:00 ) ");
                System.out.println("Пиано Бар  (22:00 - 04:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");

            } else if (openBars >= 00.00 & openBars <= 04.00) {
                System.out.println("Пиано Бар  (18:00 - 04:00 ) ");
                System.out.println("Рок Бар  (12:00 - 04:00 ) ");

                System.out.println("Блек Лабел 00:00 - 06:00) ");

            } else if (openBars >= 04.00 && openBars <= 05.00) {
                System.out.println("Клеопатра (00:00 - 05:00 ) ");
                System.out.println("Блек Лабел (00:00 - 06:00) ");
            } else if (openBars >= 05.00 & openBars <= 06.00) {
                System.out.println("Блек Лабел (00:00 - 06:00) ");

            } else if (openBars <= 08.00) {
                System.out.println("Няма отворени барове");
            } else if (openBars >= 08.01 && openBars < 08.30) {
                System.out.println("Централ (08:00 - 22:30 ) ");
            } else if (openBars >= 08.30 && openBars <= 10.00) {
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
            } else if (openBars >= 10.00 && openBars <= 12.00) {
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (10:00 - 00:00 ) ");
                System.out.println("Коктайл Бар (10:00 - 22:00 ) ");
            } else if (openBars >= 12.00  && openBars < 22.00) {
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (10:00 - 00:00 ) ");
                System.out.println("Коктайл Бар (10:00 - 22:00 ) ");
                System.out.println("Грил Бар (12:00 - 22:00 ) ");
            }
            else if(openBars <= 20.00 && openBars >= 08.00 ){
                System.out.println("Коктайл Бар (10:00 - 22:00 ) ");
                System.out.println("Грил Бар (12:00 - 22:00 ) ");
                System.out.println("Централ (08:00 - 22:30 ) ");
                System.out.println("Захира  (08:30 - 23:00 ) ");
                System.out.println("Кафе Бар Класик  (10:00 - 23:30 ) ");
                System.out.println("ЛаБелла  (10:00 - 00:00 ) ");
            }
        }
    public static void map(int n){
        if(n == 50){
            System.out.println("X___1.___2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if( n == 100){
            System.out.println("_X__1.___2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 150){
            System.out.println("__X_1.___2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 200){
            System.out.println("___X.1.___2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 250){
            System.out.println("____1.X__2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 300){
            System.out.println("____1._X_2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 350){
            System.out.println("____1.__X.2.___3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 400){
            System.out.println("____1.___2.X__3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 450){
            System.out.println("____1.___2._X_3.____4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 500){
            System.out.println("____1.___2.__X.3.____4._5._6._____7.___8.____9.____10.");
        }
        else if (n == 550){
            System.out.println("____1.___2.___3.X___4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 600){
            System.out.println("____1.___2.___3._X__4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 650){
            System.out.println("____1.___2.___3.__X_4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 700){
            System.out.println("____1.___2.___3.___X.4._5._6._____7.___8.____9.____10.");
        }
        else if(n == 750){
            System.out.println("____1.___2.___3.____4.X.5._6._____7.___8.____9.____10.");
        }
        else if(n == 800){
            System.out.println("____1.___2.___3.____4._5.X.6._____7.___8.____9.____10.");
        }
        else if(n == 850 ){
            System.out.println("____1.___2.___3.____4._5._6.X____7.___8.____9.____10.");
        }
        else if(n == 900){
            System.out.println("____1.___2.___3.____4._5._6._X___7.___8.____9.____10");
        }
        else if (n == 950){
            System.out.println("____1.___2.___3.____4._5._6.__X__7.___8.____9.____10.");
        }
        else if(n == 1000){
            System.out.println("____1.___2.___3.____4._5._6.___X_7.___8.____9.____10.");
        }
        else if(n == 1050){
            System.out.println("____1.___2.___3.____4._5._6.____X.7.___8.____9.____10.");
        }
        else if(n == 1100){
            System.out.println("____1.___2.___3.____4._5._6._____7.X__8.____9.____10.");
        }
        else if(n == 1150){
            System.out.println("____1.___2.___3.____4._5._6._____7._X_8.____9.____10.");
        }
        else if(n == 1200){
            System.out.println("____1.___2.___3.____4._5._6._____7.__X.8.____9.____10.");
        }
        else if(n == 1250){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.X___9.____10.");
        }
        else if(n == 1300){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8._X__9.____10.");
        }
        else if(n == 1350){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.__X_9.____10.");
        }
        else if(n == 1400){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.___X.9.____10.");
        }
        else if(n == 1450){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.____9.X___10.");
        }
        else if(n == 1500){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.____9._X__10.");
        }
        else if(n == 1550){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.____9.__X_10.");
        }
        else if(n == 1600){
            System.out.println("____1.___2.___3.____4._5._6._____7.___8.____9.___X10.");
        }


        System.out.println("1.Блек Лабел ");
        System.out.println("2.Централ ");
        System.out.println("3.Захира  ") ;
        System.out.println("4.Клеопатра  ");
        System.out.println("5.ЛаБелла  " );
        System.out.println("6.Коктайл Бар " );
        System.out.println("7.Пиано Бар  " );
        System.out.println("8.Рок Бар   " );
        System.out.println("9.Грил Бар  " );
        System.out.println("10.Кафе Бар Класик  " );
    }
}





