package com.jgrim;

/**
 * Created by Jon Grim on 2/15/2017.
 */
public class MergeSort {

    public static int[] mergeSort(int[] unsortedList) {
        if (unsortedList.length == 1) {
            return unsortedList;
        }
        else {
            int[] mergeListA = new int[unsortedList.length/2];
            int[] mergeListB = new int[unsortedList.length - mergeListA.length];

            for (int i = 0; i < unsortedList.length/2; i++) {
                mergeListA[i] = unsortedList[i];
            }

            mergeListA = mergeSort(mergeListA);

            for (int i = unsortedList.length/2; i < unsortedList.length; i++) {
                mergeListB[i - unsortedList.length/2] = unsortedList[i];
            }

            mergeListB = mergeSort(mergeListB);

            int a = 0;
            int b = 0;
            int i = 0;
            int[] finalMerge = new int[mergeListA.length + mergeListB.length];
            while (a < mergeListA.length && b < mergeListB.length) {
                if (a > mergeListA.length || b > mergeListB.length){
                    break;
                }
                if (mergeListA[a] < mergeListB[b]){
                    finalMerge[i] = mergeListA[a];
                    a++;
                    i++;
                } else {
                    finalMerge[i] = mergeListB[b];
                    b++;
                    i++;
                }
            }

            while (a < mergeListA.length) {
                finalMerge[i] = mergeListA[a];
                a++;
                i++;
            }

            while (b < mergeListB.length) {
                finalMerge[i] = mergeListB[b];
                b++;
                i++;
            }

            return finalMerge;
        }
    }

    public static void main (String args[]){

        int[] unsortedList = {4, 2, 8, 3, 12, 17, 9, 6, 21, 13};

        int[] sortedList;
        sortedList = mergeSort(unsortedList);

        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + " ");
        }
    }
}
