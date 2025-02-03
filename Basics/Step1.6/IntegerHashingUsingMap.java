import java.util.*;

public class IntegerHashingUsingMap {

    static int getCountOfNumber(int[] arr, int n){
    
        HashMap<Integer,Integer> map = new HashMap<>();

        //precompute
        for(int i=0 ; i<arr.length ; i++){
            int k = map.getOrDefault(arr[i],0);
            if(map.containsKey(arr[i])){
                map.put(arr[i], k+1);
            }else{
                map.put(arr[i],1);
            }
        }

        return map.get(n);

    }
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // //input size of array
        // System.out.print("Enter size of array: ");
        // int sizeOfArray = scan.nextInt();

        // //declare array 
        // int[] arr = new int[sizeOfArray];

        // //input array elements
        // for(int i=0 ; i<sizeOfArray ; i++){
        //     System.out.print("Enter " + i + " element of array : " );
        //     arr[i] = scan.nextInt();
        // }
        int[] arr2 = {1,2,3,2,3,1,4,3,3,2};
        int count = getCountOfNumber(arr2,2);
        System.out.println(count);

        // scan.close();
    }
}
