public class SearchInRotatedArray {
   
    public static int search(int[] arr, int target, int n){
        int low = 0;
        int high = n-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[low]<=arr[mid]){
                if(arr[low]<= target && target<=arr[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int n = arr.length;
        int k = 0;
        
        int res = search(arr, k, n);
        System.out.println(res);
    }
}
