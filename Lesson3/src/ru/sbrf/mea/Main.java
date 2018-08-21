package ru.sbrf.mea;

import java.util.Random;
import java.util.Scanner;

/**
 * Дз для 3 урока
 * @author  Kate
 * @date 21.08.2018
 */
public class Main {

    public static void main(String[] args) {

        generateAndCheckNumber_1();
        checkkWords_2();
    }

    /** Метод
     *  Загадывает число, запрашивает число у пользователя, проверяет числа.
     */
    public static void generateAndCheckNumber_1() {
        int number = 0, userNumber = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                for (int i = 3; i > 0; i--) {
                    number = new Random().nextInt(10);
                    System.out.println("Угадай число от 0 до 9");
                    userNumber = scanner.nextInt();
                    if (userNumber > number) {
                        System.out.println(String.format("Число больше загаданного %d", number));
                    } else if (userNumber < number) {
                        System.out.println(String.format("Число меньше загаданного %d", number));
                    } else {
                        System.out.println("Число угадано!!!");
                        break;
                    }
                }
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет");
            } while (scanner.nextInt() != 0);
        }
    }

    /**
     * Метод
     * Загадываает слово, запрашивает слово у пользователя, сравнивает слова.
     */
    public static void checkkWords_2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int number = 0;
        boolean result = false;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                number = new Random().nextInt(words.length);

                System.out.println("Угадай слово)");
                String userWord = scanner.next();

                if (words[number].equals(userWord)) {
                    System.out.println("Слово угадано!!!");
                    result = true;
                    break;
                }
                System.out.println(String.format("Слово не угадано, было загадано %s!!!", words[number]));

            }
            while (!result);


        }

    }
}
