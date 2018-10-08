package com.task.simplesorting.utils;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {


    private static int[] array;


    public  List<Integer> setArray(int size, int[] array) {
        List<Integer> list = new ArrayList<>();
        int startIndex = 0;
        int endIndex = size - 1;
        QuickSort.array = array;
        doSort(startIndex, endIndex);

        for (int a : array) {
            list.add(a);
        }
        return list;
    }


    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }



}
