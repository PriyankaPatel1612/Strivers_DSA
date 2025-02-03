public class MaximumScoreFromSubarrayMinimums {
    static int findMaxScore(int[] arr){
        int n = arr.length;
        int score = 0;
        int maxScore = Integer.MIN_VALUE;
        //finding all subarrays
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                //from i to j are subarrays
                //find smallest and second smallest
                int smallest = findSmallest(arr, i, j);
                int second_smallest = findSecondSmallest(arr, i, j);
                score = smallest + second_smallest;
                maxScore = Math.max(score, maxScore);
            }
        }
        return maxScore;
    }

    static int findSmallest(int[] arr, int i, int j){
        int smallest = Integer.MAX_VALUE;
        for(int k = i ; k<=j ; k++){
            smallest = Math.min(smallest, arr[k]);
        }
        // System.out.println("smallest - " + smallest);
        return smallest;
    }

    static int findSecondSmallest(int[] arr, int i, int j){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for(int k = i ; k<=j ; k++){
            smallest = Math.min(smallest, arr[k]);
        }
        for(int k=i ; k<=j ; k++){
            if(arr[k] < second_smallest && smallest!=arr[k]){
                second_smallest = arr[k];
            }
        }
        // System.out.println("second smallest - " + second_smallest);
        return second_smallest;
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 6};
        System.out.println(findMaxScore(arr));  
    }
}
