public class FindLowerBound {
    //selftested
    public static int findLowerBound(int[] arr, int x){
        int n = arr.length;
        int idx = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<=x){
                idx = i;;
            }
        }
        return idx>-1 ? idx : -1 ;
    }
    //optimal
    public static int findLowerBound2(int[] arr, int x){
       //using binary search
       int n = arr.length;
       int low = 0;
       int high = n-1;
       int idx = n;
       while(low<=high){
        int mid = (low+(high-low/2));
            if(arr[mid]>=x){
                idx = mid;
                //check for remaining
                high = mid-1;
            }else if(arr[mid]<x){
                low = mid+1;
            }
       }
       return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int x = 0;
        int res = findLowerBound2(arr, x);
        System.out.println(res);
    }
}
