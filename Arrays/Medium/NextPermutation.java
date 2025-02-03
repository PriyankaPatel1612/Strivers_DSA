import java.util.*;
public class NextPermutation extends FindPermutation{
    
    static void findNextPermutation(int[] arr){
        //coverting integer arr to array list
        List<Integer> currList  = new ArrayList<>();
        for(int nums : arr){
            currList.add(nums);
        }
        
        //storing all permutations
        List<List<Integer>> permutations = new ArrayList<>();
        permutations = permute(arr);

        //iterate
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(currList)) {
                // Check if it's the last permutation
                if (i + 1 < permutations.size()) {
                    System.out.println(permutations.get(i + 1));
                } else {
                    System.out.println("No next permutation, returning the first permutation: " + permutations.get(0));
                }
                break;
            }
        }
    }
    
    //find all permutations
    static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        findAllPermutations(arr, ans, 0);
        // System.out.println(ans);
        return ans;
    }

    //main
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        findNextPermutation(arr);
    }
}


//class for finding all the permutations
class FindPermutation {
    //finding all the permutation of unique elements in array using recursive appraoch by swapping elements
    static void findAllPermutations(int[] arr, List<List<Integer>> ans, int idx){
        int n = arr.length;
        //base condition
        if(idx==n){
            List<Integer> listElem = new ArrayList<>();
            //add arr elements to list elements
            for(int i=0 ; i<n ; i++){
                listElem.add(arr[i]);
            }
            //add list element to ans list
            ans.add(new ArrayList<>(listElem));
            return;
        }

        //call function recursively 
        for(int i=idx ; i<n ; i++){
            swap(i, idx, arr);
            findAllPermutations(arr, ans, idx+1);
            swap(i, idx, arr);
        }
    }

    //swap 
    static void swap(int i, int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}