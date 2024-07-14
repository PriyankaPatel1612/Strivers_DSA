public class CheckIfArrSorted {
    
    //selftested
    static boolean check(int[] arr){
        int a = 0 ;
        int b = 1;
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            if(arr[a]<arr[b]){
                // int temp = a;
                a = b;
                b = a+1;
            }else{
                return false;
            }
        }
        return true;
    }

    //optimized
    static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,2,3,4,5};
        System.out.println(check(arr));
        System.out.println(isSorted(arr));
    }
}
