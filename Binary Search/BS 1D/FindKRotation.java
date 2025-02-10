public class FindKRotation {
    public static int findRotation(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int mid;
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        while(low<=high){
            //finding mid
            mid = low+(high-low)/2;
            //compare
            if(arr[mid]<min){
                min = arr[mid];
                minIdx = mid;
            }
            //if both low and high are min than mid
            if(arr[low]<=arr[mid] && arr[mid]>=arr[high]){  
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
        return minIdx;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;
        int ans = findRotation(arr, n);
        System.out.println(ans);
    }
}
