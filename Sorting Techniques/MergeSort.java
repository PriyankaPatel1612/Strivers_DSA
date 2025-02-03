public class MergeSort {
   
    // divide
    static void divide(int[] arr, int low, int high){

        //low - starting index
        //high - highest index
        if(low>=high){
            return;
        }

        int mid = (low+high)/2;
        divide(arr, low, mid);  //for left side
        divide(arr, mid+1, high); //for right side
        merge(arr, low, mid, high);
    }

    // conquer/merge
    static void merge(int[] arr, int low, int mid, int high){

        //merged array
        int[] merged = new int[high-low + 1];

        int i = low;    //index of first list
        int j = mid+1;  //index2 of second list
        int x = 0;      //index of merged array

        //merging by comparing elements
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                merged[x++] = arr[i++];
            }else{
                merged[x++] = arr[j++];
            }
        }

        //for remaining elements
        while(i<=mid){
            merged[x++] = arr[i++];
        }
        while (j<=high) {
            merged[x++] = arr[j++];
        }

        //putting elements of merged array into original array
        for(int k=0, l=low ; k<merged.length ; k++, l++){
            arr[l] = merged[k];
        }

    }
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        int n = arr.length;
        //divide
        divide(arr, 0, n-1);
        //print
        System.out.println();
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
