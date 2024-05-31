//Pushes the maximum to the last by adjacent swapping
/*Time Complexity 
  best case = O(n)
  worst & avg case = O(n2);
*/

class BubbleSort{
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=n-1 ; i>=0 ; i--){
            //o to n-1
            for(int j=0 ; j<=i-1 ; j++){
                //adjacent swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        System.out.println("Before selection sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sort(arr);
    }
}