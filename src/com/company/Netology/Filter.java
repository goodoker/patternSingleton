package com.company.Netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        int element = 0;
        for (int i : source) {
            if (i >= treshold) {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
                element++;
            } else logger.log("Элемент " + i + " не проходит");
        }
        logger.log("Прошло фильтр " + element + " элемента из " + source.size());
        return result;
    }

}



