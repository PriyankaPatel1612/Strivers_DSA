public class RotateArrayByKElements {

    //selftested
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
        int[] arr = {1,2,3,4,5,6,7};
        rotateRight(arr, k);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
