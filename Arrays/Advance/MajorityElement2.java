import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MajorityElement2 {

    //selftested
    static List<Integer> findMajorityElement(int[] arr){
        //create result list
        ArrayList<Integer> resList = new ArrayList<>() ;
        //create hashset
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //store count of each element in hashmap
        for(int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //add element to list which have grater than n/3 count
         for(Map.Entry<Integer,Integer> m : map.entrySet()){    
            int check = arr.length/3;
            if(m.getValue()>check){
                resList.add(m.getKey());
              }   
            }  
        return resList;
    }

    //optimal
    public static List<Integer> findMajorityElement2(int[] nums) {
        int count1=0, count2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){
            if(count1==0 && nums[i]!=el2){
                el1 = nums[i];
                count1 = 1;
            }else if(count2==0 && nums[i]!=el1){
                el2 = nums[i];
                count2 = 1;
            }else if(el1==nums[i]){
                count1++;
            }else if(el2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        //check
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==el1)
            count1++;
            if(nums[i]==el2)
            count2++;
        }

        List<Integer> majoEleList = new ArrayList<>();
        int mini = (int)(nums.length/3) + 1;
        if(count1>=mini)
        majoEleList.add(el1);
        if(count2>=mini)
        majoEleList.add(el2);
        
        return majoEleList;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,3,2,3};
        List<Integer> list = findMajorityElement(arr);
        System.out.println(list);

        //optimal
        List<Integer> list2 = findMajorityElement2(arr);
        System.out.println(list2);
    }
}
