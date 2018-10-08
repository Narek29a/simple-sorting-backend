package com.task.simplesorting.service;

import com.task.simplesorting.utils.MergeSort;
import com.task.simplesorting.utils.QuickSort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class SortingService {


    /**performance of sorting algorithms*/

    private long bubbleSortingTime;
    private long selectionSortingTime;
    private long insertionSortingTime;
    private long mergeSortingTime;
    private long quickSortingTime;

    /**Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.*/


    public List<Integer> getBubble(int size) {
        long startTime = System.nanoTime();

        List<Integer> arrayList = new ArrayList<>();
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        long endTime = System.nanoTime();

        this.bubbleSortingTime = (endTime - startTime);

        for (int i : numbers) {
            arrayList.add(i);
        }
        return arrayList;
    }

/**
 *  The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 *  from unsorted part and putting it at the beginning.
 *  The algorithm maintains two subarrays in a given array.
 *
 * */
    public List<Integer> getSelection(int size) {
        long startTime = System.nanoTime();

        List<Integer> arrayList = new ArrayList<>();
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (numbers[j] < numbers[min])
                    min = j;
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }

        long endTime = System.nanoTime();

        this.selectionSortingTime = (endTime - startTime);

        for (int i : numbers) {
            arrayList.add(i);

        }
        return arrayList;
    }



/**
 * In most cases the insertion sort is the best of the elementary sorts described in this
 * chapter. It still executes in O(N 2 ) time, but it’s about twice as fast as the bubble sort
 * and somewhat faster than the selection sort in normal situations. It’s also not too
 * complex, although it’s slightly more involved than the bubble and selection sorts.
 * It’s often used as the final stage of more sophisticated sorts, such as quicksort.
 * */

    public  List<Integer> getInsertion(int size) {
        long startTime = System.nanoTime();

        List<Integer> arrayList = new ArrayList<>();
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        int out, in;
        for (out = 1; out < numbers.length; out++) {
            int temp = numbers[out];
            in = out;
            while (in > 0 && numbers[in - 1] > temp) {
                numbers[in] = numbers[in - 1];
                --in;
            }
            numbers[in] = temp;

        }

        long endTime = System.nanoTime();
        this.insertionSortingTime = (endTime - startTime);

        for (int i : numbers) {
            arrayList.add(i);
        }
        return arrayList;

    }

    /**
     * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
     * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
     * The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.
     * See following C implementation for details.
     *
     */

    public List<Integer> getMerge(int size) {
        long startTime = System.nanoTime();
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        this.mergeSortingTime = (endTime - startTime);

        return mergeSort.getArray(arr);

    }

    /**
     * Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
     * It picks an element as pivot and partitions the given array around the picked pivot.
     * There are many different versions of quickSort that pick pivot in different ways.
     */

    public  List<Integer> getQuick(int size) {
        long startTime = System.nanoTime();

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        QuickSort quickSort = new QuickSort();

        long endTime = System.nanoTime();

        this.quickSortingTime = (endTime - startTime);

        return quickSort.setArray(size, array);



    }


    public long getBubbleSortingTime() {
        return bubbleSortingTime;
    }

    public long getSelectionSortingTime() {
        return selectionSortingTime;
    }

    public long getInsertionSortingTime() {
        return insertionSortingTime;
    }

    public long getMergeSortingTime() {
        return mergeSortingTime;
    }

    public long getQuickSortingTime() {
        return quickSortingTime;
    }


}
