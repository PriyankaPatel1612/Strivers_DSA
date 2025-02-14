public class FindSingleElement {
    public static int findElement(int[] arr, int n){
        int low = 0;
        int high = n-1;
        int mid;
        int ele = -1;

        //if array is empty
        if(n==0){
            return -1;
        }
        //if there is only one element
        if(n==1){
            return arr[0];
        }
        //if first element is single element
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        //if last element is single element
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }

        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            ele = arr[mid];
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,5,5,6};
        int n = arr.length;
        int res = findElement(arr,n);
        System.out.println(res);
    }
}
