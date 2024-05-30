//frequency count from 1 to N
/*Ques->
Given an array arr[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. */

import java.util.HashMap;

public class Ques6 {
    public static void frequencyCount(int arr[], int N, int P){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int e: arr){
            hm.put(e, hm.getOrDefault(e,0)+1);
        }
        
        for(int i=0; i<N; i++){
            arr[i]= hm.getOrDefault(i+1,0);
        }

        for(int i : arr){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        frequencyCount(arr, 5, 5);
    }
}
