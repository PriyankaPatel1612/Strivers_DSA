public class LargestElement {
    static int largest(int[] arr){
        int larg = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,7,5,1};
        int l = largest(arr);
        System.out.println("Largest number: " + l);
    }
}
