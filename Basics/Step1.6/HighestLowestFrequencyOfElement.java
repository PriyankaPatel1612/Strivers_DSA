import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequencyOfElement {

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
        int maxKey = 0;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>max){
                max = it.getValue();
                maxKey = it.getKey();
            }
        }
        return maxKey;
    }

    //lowest frequency element
    static int findLowest(int[] arr){

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
        int min = Integer.MAX_VALUE;
        int minKey = 0;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()<min){
                min = it.getValue();
                minKey = it.getKey();
            }
        }
        return minKey;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        System.out.println(findHighest(arr));
        System.out.println(findLowest(arr));
    }
}
