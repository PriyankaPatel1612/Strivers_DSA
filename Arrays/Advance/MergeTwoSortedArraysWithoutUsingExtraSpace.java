import java.util.Arrays;

public class MergeTwoSortedArraysWithoutUsingExtraSpace {

    static void merge(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i=0 ; i<n1 ; i++){
            for(int j=0 ; j<n2 ; j++){
                if(arr1[i]<arr2[j]){
                    continue;
                }else if(arr1[i]>arr2[j]){
                    //swap
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        Arrays.sort(arr2);
        for(int el : arr1 ){
            System.out.println(el);
        }

        for(int i=0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }

    static void merge2(int[] arr1,int[] arr2){
        int n1 = arr1.length+arr2.length;
        int n2 = arr2.length;

        for(int i=0 ; i<n1 ; i++){
            for(int j=0 ; j<n2 ; j++){
                if(arr1[i]<arr2[j]){
                    continue;
                }else if(arr1[i]>arr2[j]){
                    //swap
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,8,10};
        int[] arr2 = {2,3,9};
        merge(arr1, arr2);
    }
}
