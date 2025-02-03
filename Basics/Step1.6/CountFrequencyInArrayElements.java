import java.util.HashMap;

public class CountFrequencyInArrayElements {
    static void coutFrequency(int[] arr){
        //mapping numbers and their count in hash map
        HashMap<Integer,Integer> map = new HashMap<>();
        int k;
        for(int i=0 ; i<arr.length ; i++){
            k = map.getOrDefault(arr[i],0);
            if(map.containsKey(arr[i])){
                map.put(arr[i], k+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //place count in array
        for(int i=0 ; i<arr.length ; i++){
            if (map.containsKey(i+1)){
                arr[i] = map.get(i+1);
            }else{
                arr[i] = 0;
            }
        }

        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        coutFrequency(arr);

        //print array
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
