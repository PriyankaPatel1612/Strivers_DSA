public class SearchInsertionPosition {
    public static int search(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int idx = -1;
        while(low<=high){
            int mid = (low + (high-low)/2);
            if(arr[mid]>=x){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low==n){
            return n;
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7}; //0 1 2 3 2+3= 5 5/2=2 
        int x = 6;
        System.out.println(search(arr, x));
    }
}
