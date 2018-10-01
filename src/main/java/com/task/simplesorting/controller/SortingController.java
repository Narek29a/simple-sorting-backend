package com.task.simplesorting.controller;

import com.task.simplesorting.models.StorageArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SortingController {


    @CrossOrigin("*")
    @RequestMapping(value = "bubble", method = RequestMethod.POST)
    public ArrayList<Integer> getBubble(@RequestBody StorageArray storageArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] numbers = storageArray.getNumbers();

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
        for (int i : numbers) {
            arrayList.add(i);
        }
        return arrayList;

    }






    @CrossOrigin("*")
    @RequestMapping(value = "selection", method = RequestMethod.POST)
    public ArrayList<Integer> getSelection(@RequestBody StorageArray storageArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] numbers = storageArray.getNumbers();
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (numbers[j] < numbers[min])
                    min= j;
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        for (int i : numbers) {
            arrayList.add(i);

        }
        return arrayList;
    }




    @CrossOrigin("*")
    @RequestMapping(value = "insertion", method = RequestMethod.POST)
    public ArrayList<Integer> getInsertion(@RequestBody StorageArray storageArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] numbers = storageArray.getNumbers();
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
        for (int i : numbers) {
            arrayList.add(i);
        }
        return arrayList;
    }


}
