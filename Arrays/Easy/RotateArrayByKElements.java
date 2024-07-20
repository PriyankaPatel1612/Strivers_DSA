public class RotateArrayByKElements {

    //optimized time-O(n),space-O(1)
    static void rotateLeft2(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        //reverse first k elements
        reverse(0, k-1, arr);
        //reverse n-k elements
        reverse(k,n-1, arr);
        //reverse arr
        reverse(0, n-1, arr);
    }
    static void rotateRight2(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        //reverse last k elements
        reverse(n-k, n-1, arr);
        //reverse n-k elements
        reverse(0,n-k-1, arr);
        //reverse arr
        reverse(0, n-1, arr);
    }
    static void reverse(int sidx, int eidx, int[] arr){
        while(sidx<eidx){
            int temp = arr[sidx];
            arr[sidx] = arr[eidx];
            arr[eidx] = temp;
            sidx++;
            eidx--;
        }
    }

    //selftested using recursion
    static void rotateLeft(int[] arr, int k){
        if(k==0){
            return;
        }
        int n=arr.length;
        int temp = arr[0];
        for(int i=0 ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        rotateLeft(arr, k-1);
    }
    static void rotateRight(int[] arr, int k){
        if(k==0){
            return;
        }
        int n=arr.length;
        int temp = arr[n-1];
        for(int i=n-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        rotateRight(arr, k-1);
    }
    
    public static void main(String[] args) {
        int k=3;
        int[] arr = {-1};

        // rotateRight(arr, k);
        // rotateLeft(arr, k);
        rotateRight2(arr, k);
        // rotateLeft2(arr, k);

        //print arr
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
