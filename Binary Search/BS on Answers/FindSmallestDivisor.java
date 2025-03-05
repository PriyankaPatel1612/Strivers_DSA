public class FindSmallestDivisor {
    public static int findSmallestDivisor(int[] arr, int limit){
        int low = 1;
        int max = Integer.MIN_VALUE;
        //find max in arr
        for(int i=0 ; i<arr.length ; i++){
            max = Math.max(max, arr[i]);
        }
        int high = max;
        int mid;
        int smallestDiv = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            int sum = findSumOfDivisors(mid, arr);
            if(sum<=limit){
                smallestDiv = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return smallestDiv;
    }

    public static int findSumOfDivisors(int divisor, int[] arr){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=Math.ceilDiv(arr[i], divisor);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int limit = 10;
        int ans = findSmallestDivisor(arr, limit);
        System.out.println(ans);
    }
}
