public class MinimumInRotatedArray {

    public static int findMinimum(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int mid;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            mid = low+(high-low)/2;

            //comapre min
            if(arr[mid]<min){
                min = arr[mid];
            } 

            if(arr[low]<=arr[mid] && arr[mid]>=arr[high]){  //if both low and high are min than mid
                if(arr[high]<arr[low]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else if(arr[low]<=arr[mid]){  //if only low is min than mid
                high = mid - 1;
            }else if(arr[mid]>=arr[high]){  //if only high s min than mid
                low = mid + 1;
            }else{   
                low = low + 1;
                high = high - 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        int n = arr.length;
        int res = findMinimum(arr, n);
        System.out.println(res);
    }
}
