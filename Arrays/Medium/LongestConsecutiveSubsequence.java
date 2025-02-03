import java.util.Arrays;
import java.util.HashSet;
public class LongestConsecutiveSubsequence {

    //optimized
    static int findLongestConsecutiveSequence2(int[] arr){
        int count = 0, longest = 1;

        if(arr.length == 0){
            return 0;
        }

        //create set
        HashSet<Integer> set = new HashSet<>();

        //copy array elements into set
        for(int i=0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }

        //traverse set
        for(int it : set){
            if(!set.contains(it-1)){
                count = 1;  
                int x = it;              
                while(set.contains(x+1)){
                    count++;
                    x += 1;
                }
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
    
    //selftested
    static int findLongestConsecutiveSequence(int[] arr){
        //corner case 
        if(arr.length == 0){
            return 0;
        }
        if(arr.length == 1){
            return 1;
        }

        //sort array
        Arrays.sort(arr);

        //store first consecutive element
        int currEle = arr[0];

        //initialize length to 1
        int lengthCount = 1;
        int maxCount = 0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==(currEle+1)){
                currEle++;
                lengthCount++;
            }else if(arr[i] == currEle){
                continue;
            }else{
                currEle = arr[i];
                lengthCount = 1;
            }
            maxCount = Math.max(lengthCount, maxCount);
        }
        maxCount = Math.max(lengthCount, maxCount);
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        // System.out.println(arr.length);
        int length = findLongestConsecutiveSequence2(arr);
        System.out.println(length);
        }
}
