package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int maxSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        String strRandomList = "";
        for (int i = 0; i < maxSize; i++ ) {
            randomList.add(random.nextInt(maxValue));
            strRandomList += randomList.get(i) + " ";
        }
        System.out.println("Вот случайный список: " + strRandomList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);

        logger.log("Запускаем фильтрацию");
        List<Integer> filterList = filter.filterOut(randomList);
        String strFilterList = "";
        for (Integer i : filterList) {
            strFilterList += i + " ";
        }
        logger.log("Выводим результат на экран");
        System.out.println("Вот отфильтрованный список: " + strFilterList);
        logger.log("Завершаем программу");
    }
}