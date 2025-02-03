import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class CountSubarrayWithXorK {
    static int countSubArrays(ArrayList<Integer> list, int k){
        int count=0, xor = 0;
        //map
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(xor,1);
        //traverse
        for(int i=0 ; i<list.size() ; i++){
            //check xor
            xor = xor ^ list.get(i);
            //prexor
            int prexor = xor ^ k;
            //check
            if (map.containsKey(prexor)) {
                count += map.get(prexor);
            }

            //if exist update else put 
            if (map.containsKey(xor)) {
                map.put(xor, map.get(xor) + 1);
            } else {
                map.put(xor, 1);
            }

        }
        return count;        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        int k=5;
        System.out.println(countSubArrays(list, k)); 
    }
}
