public class LeftRotateByOne {
    //selftested
    static void rotateByOne(int[] arr){
        int n=arr.length;
        int temp = arr[0];
        for(int i=0 ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotateByOne(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
