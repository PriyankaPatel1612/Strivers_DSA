public class RemoveDuplicatesFromSortedArr {
    static int removeDuplicates(int[] arr){
        int i=0;
        int n = arr.length;
        for(int j=0 ; j<n ; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        // removeDuplicates(arr);
        int k = removeDuplicates(arr);
        System.out.println(k);    
    }
}
