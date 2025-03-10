//select min index , swap
/*Time Complexity 
  best, worst & avg case = O(n^2);
*/
public class SelectionSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int min=i;
            //find min
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            // swap(arr[min],arr[i]);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.println("After selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }    
    }

    public static void main(String[] args) {
        int[] arr = {13,46,56,52,20,9};
        
        System.out.println("Before selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sort(arr);
    }
}
