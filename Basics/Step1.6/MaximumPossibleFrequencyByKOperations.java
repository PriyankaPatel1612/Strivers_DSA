import java.util.HashMap;
import java.util.Map;

public class MaximumPossibleFrequencyByKOperations {
    static int findMaxFrequency(int[] arr, int k){
        int n = arr.length;
        int i=2;
        while(k!=0){
            int e = arr[n-1];
            while(arr[n-i]!=e && k!=0){
                arr[n-i]++;
                k--;
            }
            i++;
        }
        int f = findHighest(arr);
        return f;
    }

    //highest frequency element
    static int findHighest(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            int k = map.getOrDefault(arr[i],0);
            if(map.containsKey(arr[i])){
                map.put(arr[i], k+1);
            }else{
                map.put(arr[i],1);
            }
        }

        System.out.println(map);
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>max){
                max = it.getValue();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,13};
        System.out.println(findMaxFrequency(arr, 5));
    } 
}
