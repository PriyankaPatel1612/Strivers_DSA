import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    //selftested //optimized
    static ArrayList<Integer> findLeaders2(int[] arr){

        //length 
        int n = arr.length;

        //list of leaders
        ArrayList<Integer> leaders = new ArrayList<>();

        //last element is always be a leader
        int max = arr[n-1];
        leaders.add(arr[n-1]);

        //traverse and check leaders
        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i]>=max){
                max=arr[i];
                leaders.add(max);
            }
        }
        return leaders;
    }


    //selftested
    static ArrayList<Integer> findLeaders1(int[] arr){

        //length of array
        int n = arr.length;

        //create list
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> leaders = new ArrayList<>();

        //add elements to list 
        for(int i=0 ; i<n ; i++){
            list.add(arr[i]);
        }

        //logic
        int i=n-1, j=n-1;
        leaders.add(arr[i]);
        while(i>=0 && j>=0){
            
            if(list.get(j) > list.get(i) ){
                leaders.add(list.get(j));
                i=j;
            } 
            j--;
        }
        return leaders;
    }

    //main
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        //selftested
        ArrayList<Integer> leaders1 =  new ArrayList<>();
        leaders1 = findLeaders1(arr);
        System.out.println(leaders1);

        //optimized
        ArrayList<Integer> leaders2 =  new ArrayList<>();
        leaders2 = findLeaders1(arr);
        System.out.println(leaders2);
        Collections.sort(leaders2, Collections.reverseOrder());
        
    }
}
