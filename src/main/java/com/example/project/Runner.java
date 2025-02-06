package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String[] list = {"hi", "hello", "world", "super", "nice"};
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(list));
        ArrayList<String> superNewList = Main.insertAfterI(newList, "new");
        System.out.println(superNewList);
        Main.removeThree(superNewList);
        System.out.println(superNewList);
        int[] numList = {1,2,3,4,5,6,7,8};
        System.out.println(Main.reverseArray(numList));
        System.out.println(Main.duplicateUpperEnd(superNewList));
        System.out.println(Main.parseSentence("This is my sentence!"));
        String[] bWords = {"apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"};
        ArrayList<String> moved = new ArrayList<>(Arrays.asList(bWords));
        System.out.println(Main.moveBWords(moved));
        ArrayList<Integer> dupes = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2));
        System.out.println(Main.removeDuplicates(dupes));
        ArrayList<Integer> same = new ArrayList<>(Arrays.asList(1));
        System.out.println(Main.sameFirstLast(same));
        ArrayList<Integer> swap = new ArrayList<>(Arrays.asList(8, 6, 7, 9, 5));
        System.out.println(Main.swapEnds(swap));
        ArrayList<Integer> zeros = new ArrayList<>(Arrays.asList(1, 0, 0, 2, 3, 0, 5, 0, 1, 1, 0));
        System.out.println(Main.zeroFront(zeros));
        ArrayList<Integer> alone = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 2));
        System.out.println(Main.notAlone(alone, 2));
        ArrayList<Integer> left = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 2));
        System.out.println(Main.shiftLeft(left));
        ArrayList<Integer> fix = new ArrayList<>(Arrays.asList(1, 3, 1, 4, 4, 3, 1));
        System.out.println(Main.fix34(fix));
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        System.out.println(Main.modes(nums));
    }
}