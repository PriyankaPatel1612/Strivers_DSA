import java.util.Arrays;

public class BinarySearchRecursive{
    public static int search(int[] arr, int target, int high, int low){
        Arrays.sort(arr);
        if(high<low){
            return -1;
        }
        int mid = (low+(high-low)/2);
        if(arr[mid]==target){
            return arr[mid];
        }else if(arr[mid]<target){
            return search(arr, target, high, mid+1);
        }else{
            return search(arr, target, mid-1, low);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 7, 0, 12, 16, 17};
        int target = 9;
        int res = search(arr, target,arr.length-1,0);
        if(target==res){
            System.out.println("Found!!");
        }else{
            System.out.println("Not Found :(");
        }
    }
}
