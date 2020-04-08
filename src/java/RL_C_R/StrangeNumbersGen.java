/*
 * Copyright (C) 2020 Mark Blokker ~ Ad-Blokker
 */
package RL_C_R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mark Blokker ~ Ad-Blokker
 */
public class StrangeNumbersGen {

    public static double Generate(double stepCount, int maxIndex, int minIndex) {

        Random randNumber = new Random();

        double number = minIndex;
        List<Double> numberList = new ArrayList<>();
        while (number < maxIndex) {
            numberList.add(number);
            number += stepCount;
        }

        int randomIndex = randNumber.nextInt(numberList.size());

        return numberList.get(randomIndex);

    }
}

