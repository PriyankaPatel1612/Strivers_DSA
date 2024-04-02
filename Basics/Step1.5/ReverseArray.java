import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        printRevArray(arr);
        //print reversed array elements
        for(int i=0 ; i<arr.length ; i++)
        System.out.print(arr[i]+ " ");
        
    }

    static void printRevArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        revArray(arr,i,j);
        
    }

    static void revArray(int[] arr, int i, int j){
        if(i>j)
        return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        revArray(arr, ++i, --j);
    }
}
