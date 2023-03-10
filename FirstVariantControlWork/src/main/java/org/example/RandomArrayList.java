package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = createRandomArrayList();
        System.out.println("Random ArrayList: " + list);
        System.out.println("List of positive elements: " + getPositiveElements(list));
    }

    public static ArrayList<Integer> createRandomArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(201) - 100; // generate a random integer between -100 and 100
            list.add(num);
        }
        return list;
    }

    public static ArrayList<Integer> getPositiveElements(ArrayList<Integer> list) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        for (int num : list) {
            if (num > 0) {
                positiveList.add(num);
            }
        }
        return positiveList;
    }
}

