package ru.sbrf.mea;

/**@author Ekaterina M
 * This class for 1 lesson
 *
 */
public class MainClass {
    public static void main(String[] args) {
        initVariables();
        System.out.println(calcExp(1,2,3,4));
    }

    public static void initVariables() {
        byte a=127;
        short b=32000;
        int c=1234;
        long d= 12L;
        float e=1.2f;
        double k=123.44;
        boolean bool=true;
        char ch='g';

    }


    public static int calcExp(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
