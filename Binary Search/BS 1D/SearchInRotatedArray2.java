public class SearchInRotatedArray2 {

    public static boolean search(int[] arr, int target, int n){
       
        int high = n-1;
        int low = 0;
        int mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int n = arr.length;
        int target = 0;
        boolean res = search(arr, target, n);
        System.out.println(res);
    }
}
