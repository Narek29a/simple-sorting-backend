package com.task.simplesorting.controller;

import com.task.simplesorting.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SortingController {


    @Autowired
    private SortingService sortingService;


    @CrossOrigin("*")
    @RequestMapping(value = "bubble", method = RequestMethod.POST)
    public List<Integer> getBubble(@RequestParam(value = "arraySize")int bubbleSize) {
        return sortingService.getBubble(bubbleSize);

    }



    @CrossOrigin("*")
    @RequestMapping(value = "selection", method = RequestMethod.POST)
    public List<Integer> getSelection(@RequestParam(value = "arraySize")int selectionSize) {
        return sortingService.getSelection(selectionSize);
    }




    @CrossOrigin("*")
    @RequestMapping(value = "insertion", method = RequestMethod.POST)
    public List<Integer> getInsertion(@RequestParam(value = "arraySize")int insertionSize) {
        return sortingService.getInsertion(insertionSize);
    }

    @CrossOrigin("*")
    @RequestMapping(value = "merge", method = RequestMethod.POST)
    public List<Integer> getMerge(@RequestParam(value = "arraySize") int mergeSize) {
        return sortingService.getMerge(mergeSize);
    }


    @CrossOrigin("*")
    @RequestMapping(value = "quick", method = RequestMethod.POST)
    public List<Integer> getQuick(@RequestParam(value = "arraySize")int quickSize) {
        return sortingService.getQuick(quickSize);
    }




    @CrossOrigin("*")
    @RequestMapping(value = "bubbleTime")
    public long getBubbleTime() {
        return sortingService.getBubbleSortingTime();
    }

    @CrossOrigin("*")
    @RequestMapping(value = "selectionTime")
    public long getSelectionTime() {
        return sortingService.getSelectionSortingTime();
    }


    @CrossOrigin("*")
    @RequestMapping(value = "insertionTime")
    public long getInsertionTime() {
        return sortingService.getInsertionSortingTime();
    }

    @CrossOrigin("*")
    @RequestMapping(value = "mergeTime")
    public long getMergeTime() {
        return sortingService.getMergeSortingTime();
    }

    @CrossOrigin("*")
    @RequestMapping(value = "quickTime")
    public long getQuickTime() {
        return sortingService.getQuickSortingTime();
    }










}
