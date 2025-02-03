import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //selftested
    static int majorityElement(int[] arr){
        //hashing using hash map
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            //if element already exist then increase count
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);        //if not then put with count 1
            }
        }

        //check majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
            int n = arr.length/2;
            if(entry.getValue()>n){
                return entry.getKey();
            } 
        }
        return -1;
    }

    //optimal
    //moore's voting algorithm
    /*
        //pick current element
        //increase count is same and decrease if different
        //if count is zero update current element with nextone
        //at the end if count is greater then zero then store that element
        //find the element's total count 
        //if greater than n/2 return no. else return -1
     */
    public static int majorityElement2(int []arr) {
        int n = arr.length;
        int currEle = arr[0];
        int count=1;
        for(int i=1 ; i<n ; i++){
            if(count==0){
                currEle = arr[i];
            }
            if(arr[i]==currEle){
                count++;
            }else{
                count--;
            }
        }
        int cnt=0;
        if(count>0){
            for(int j=0 ; j<n ; j++){
                if(arr[j]==currEle){
                    cnt++;
                }
            }
        }
        if(cnt>n/2){
            return currEle;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        // int[] arr = {2, 2, 2, 1, 1, 1};
        System.out.println(majorityElement2(arr));
        
    }
}
