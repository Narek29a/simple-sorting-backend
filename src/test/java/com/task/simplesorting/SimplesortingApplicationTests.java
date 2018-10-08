package com.task.simplesorting;

import com.task.simplesorting.controller.SortingController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplesortingApplicationTests {

    @Autowired
    private SortingController sortingController;


    @Test
    public void bubbleSortTest() {
        List<Integer> sorted = sortingController.getBubble(4);

        Assert.assertTrue(sorted.get(0) <= sorted.get(1)
                && sorted.get(1) <= sorted.get(2)
                && sorted.get(2) <= sorted.get(3));
    }

    @Test
    public void selectionSortTest() {
        List<Integer> sorted = sortingController.getSelection(4);

        Assert.assertTrue(sorted.get(0) <= sorted.get(1)
                && sorted.get(1) <= sorted.get(2)
                && sorted.get(2) <= sorted.get(3));

    }

    @Test
    public void insertionSortTest() {
        List<Integer> sorted = sortingController.getInsertion(4);

        Assert.assertTrue(sorted.get(0) <= sorted.get(1)
                && sorted.get(1) <= sorted.get(2)
                && sorted.get(2) <= sorted.get(3));

    }



    @Test
    public void mergeSortTest(){

        List<Integer> sorted = sortingController.getMerge(4);

        Assert.assertTrue(sorted.get(0) <= sorted.get(1)
                && sorted.get(1) <= sorted.get(2)
                && sorted.get(2) <= sorted.get(3));

    }

    @Test
    public void quickSortTest() {
        List<Integer> sorted = sortingController.getQuick(4);

        Assert.assertTrue(sorted.get(0) <= sorted.get(1)
                && sorted.get(1) <= sorted.get(2)
                && sorted.get(2) <= sorted.get(3));

    }



}
