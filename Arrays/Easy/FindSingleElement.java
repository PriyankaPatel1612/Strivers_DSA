import java.util.*;

//selfested
public class FindSingleElement {
    static int findSingleElement(int[] arr){
        int n=arr.length;
        //algo
        //for 0 to n
        //for 0 to n
          //c=0
          
          //i==j c++
        //if c==1 tc=arr[i] break
        //c=0

        int c=0;
        int c1 = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
                c1 = arr[i];
                break;
            }
            c=0;
        }
        return c1;
    }

    //better approach
    static int findSingleElement2(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i],val+1);
        }

        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }

        return 0;
        
    }
    //optimized time-O(n) space-O(1)
    static int findSingleElement3(int[] arr){
        int n = arr.length;
        int xorr = 0;
        for(int i=0 ; i<n ; i++){
            xorr = xorr^arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3}; 
        // int element = findSingleElement1(arr);
        // int element = findSingleElement2(arr);   
        int element = findSingleElement3(arr);
        System.out.println(element);
    }
}
