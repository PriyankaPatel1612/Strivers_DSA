import java.util.Arrays;

public class BinarySearchIterative {
    public static int search(int[] arr, int target){
        //sort
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        int mid;
        while(low<=high){
            mid = (low+(high-low)/2);
            //compare
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 7, 0, 12, 16, 17};
        int target = 9;
        int res = search(arr, target);
        if(target==res){
            System.out.println("Found!!");
        }else{
            System.out.println("Not Found :(");
        }

    }
}

/*
 * Approach
 * sorted array
 * LOW at initial index 
 * HIGH at last index
 * find MID using formula MID = LOW + (HIGH-LOW)/2
 * compare target with current idx element if equal, greater or smaller
 * if equal then return idx
 * if greater move to right update LOW to MID+1
 * if smaller then move left update HIGH to MID-1
 * if HIGH becomes smaller then LOW then return -1 it means element not found
 */