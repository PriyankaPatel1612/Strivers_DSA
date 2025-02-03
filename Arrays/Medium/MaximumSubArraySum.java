public class MaximumSubArraySum {
    static int findMaxSubarraySum(int[] arr){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0 ; i<n ; i++){
            sum=0;

            for(int j=i ; j<n ; j++){
                sum = sum+arr[j];
                System.out.println(sum);
                maxSum = Math.max(maxSum, sum);
            }
        }
        if(maxSum<0){
            return 0;
        }

        return maxSum;
    }

    //using kadane's algorithm
    static long findMaxSubarraySum2(int[] arr){
        int n=arr.length;
        long sum=Long.MIN_VALUE, maxSum=Long.MIN_VALUE, sidx=0, eidx=0;
        for(int i=0 ; i<n; i++){
            //checking negative ones
            if(sum<0){
                sum=0;
                sidx = i+1;
            }
            
            //sum 
            sum = sum + arr[i];
            System.out.println(sum);
            
            //checking max
            if(maxSum < sum){
                maxSum = sum;
                eidx = i;
            }
            
        }
        System.out.println( sum + "  " + sidx + "  " + eidx);
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubarraySum2(arr));
    }
}
