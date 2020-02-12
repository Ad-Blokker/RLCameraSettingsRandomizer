/*
 * Copyright (C) 2020 mblok
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package RL_C_R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
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

