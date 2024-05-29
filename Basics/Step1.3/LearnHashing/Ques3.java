//intersection of two arrays

import java.util.HashSet;

public class Ques3 {

    static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0 ; i<arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i=0 ; i<arr2.length ; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9,2};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(intersection(arr1, arr2));
    }
}
