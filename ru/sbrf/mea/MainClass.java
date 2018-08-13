package ru.sbrf.mea;

/**
 * @author Ekaterina M
 * This class for 1 lesson
Создала ветку lesson 1 для PR
 */
public class MainClass {

    public static void main(String[] args) {
        initVariables_2();
        System.out.println(calcExp_3(1, 2, 3, 4));
        System.out.println(checkSumm_4(10, 0));//false
        System.out.println(checkSumm_4(10, 5));//true;
        System.out.println(checkSumm_4(10, 10));//true;
        System.out.println(checkSumm_4(10, 20));//false
        printSignOfNumber_5(0);//пол.чис.
        printSignOfNumber_5(3);//пол.чис.
        printSignOfNumber_5(-1);//отр.чис.

        System.out.println(isNegativeNumber_6(-1));//true
        System.out.println(isNegativeNumber_6(0));//false

        printName_7("Катюша");

        printIsLeapYear(1957);
        printIsLeapYear(2004);

    }

    public static void initVariables_2() {
        byte a = 127;
        short b = 32000;
        int c = 1234;
        long d = 12L;
        float e = 1.2f;
        double k = 123.44;
        boolean bool = true;
        char ch = 'g';

    }

    public static int calcExp_3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean checkSumm_4(int a, int b) {
        long sum = a + b;
        return (sum > 10 && sum <= 20) ? true : false;
    }

    public static void printSignOfNumber_5(int number) {
        String str;
        if (number >= 0) {
            str = "Положительное число";
        } else {
            str = "Отрицательное число";
        }
        System.out.println(str);
    }

    public static boolean isNegativeNumber_6(int a) {
        return (a < 0) ? true : false;
    }

    public static void printName_7(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void printIsLeapYear(int year) {
        String str=Integer.toString(year);
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                str=str+": Год високосный!";
            } else {
                if (year % 400 == 0) {
                    str=str+": Год високосный!";
                } else {
                    str=str+": Год обычный!";
                }
            }
        }
        else {
            str=str+": Год обычный!";
        }
        System.out.println(str);
    }
}
