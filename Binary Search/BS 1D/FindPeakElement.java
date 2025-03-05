public class FindPeakElement {

    public static int findPeakElement(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int mid;
        int peakIdx = -1;
        while(low<=high){
            mid = low + (high-low)/2;

            //if peak element is at 0th index 
            // 0th index element greater than 1st index
            if(arr[0]>arr[1]){
                return 0;
            }
            //if peak element is at last index
            //n-1 index is greater than n-2 index
            if(arr[n-1]>arr[n-1]){
                return n-1;
            }
            //if in between  then
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]>arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            peakIdx = mid;
        }
        return peakIdx;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int n = arr.length;
        int res = findPeakElement(arr, n);
        System.out.println(res);
    }
}
