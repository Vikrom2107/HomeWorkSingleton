package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int filterValue;
    public Filter (int f) {
        filterValue = f;
    }
    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> filterList = new ArrayList<>();
        for (Integer i : list) {
            if (i > filterValue) {
                logger.log("Элемент " + i + " проходит");
                filterList.add(i);
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + filterList.size() + " элемента из " + list.size());
        return filterList;
    }
}
