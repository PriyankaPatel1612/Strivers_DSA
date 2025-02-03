        //inputs
        /* 
        array size
        array element
        total numbers to check frequency 
        numbers
        */

import java.util.Scanner;

public class IntegerHashing{
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        //input size of array
        System.out.print("Enter size of array: ");
        int sizeOfArray = scan.nextInt();

        int[] arr = new int[sizeOfArray];
        //input array elements
        for(int i=0 ; i<sizeOfArray ; i++){
            System.out.print("Enter " + i + "element of array : " );
            arr[i] = scan.nextInt();
        }

        //max of array
        int max = findMaxInArray(arr);

        //precompute
        int hash[] = new int[max+1];
        for(int i=0 ; i<sizeOfArray ; i++){
            hash[arr[i]]+=1;
        }

        //input total count of numbers to check frequency
        System.out.print("Enter total queries : "); 
        int totalQueries = scan.nextInt();

        //input numbers
        while(totalQueries-- != 0){
            System.out.print("Enter number to check: ");
            int numbers = scan.nextInt();
            //fetch
            System.out.println(hash[numbers]);
        }
       
    }

    static int findMaxInArray(int[] arr){
        int max = arr[0];
        for(int i=1 ; i<arr.length ; i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}