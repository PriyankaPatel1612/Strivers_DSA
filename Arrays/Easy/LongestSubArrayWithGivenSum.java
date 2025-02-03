import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    // brute force approach (finding all the subarrays and check sum)      T.C. - O(N^2)
    static int findLongestArr1(int[] arr, int n, int k) {
        int length = 0, maxLength = 0, sum = 0;
        // traverse all the subarrays
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                // sum of subarrays
                sum += arr[j];
                // length of subarrays
                length = j - i + 1;
                if (sum == k) {
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }

    // optimized approach(2 POINTER APPROACH)          T.C.- O(2*N)
    static int findLongestArr2(int[] arr, int n, int k) {
        // 2 pointers
        int left = 0, right = 0;
        int maxLength = 0, sum = arr[0];

        // traverse until right is less that length
        while (right < n) {
            // if sum is > k then until
            // sum is greater array is decreased from the left also sum is decreased
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            // if sum == k store max length
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            // right increses if sum < k right is increased and sum is added
            right++;
            if (right < n) {
                sum = sum + arr[right];
            }
        }
        return maxLength;
    }

    //optimized (Using HashMap)            T.C. - O(N) or O(NlogN)
    static int findLongestArr3(int[] arr, int n, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0, length=0, maxLength=0;
        for(int i=0 ; i<n ; i++){
            //sum
            sum+=arr[i];

            //if sum == k store update length
            if(sum == k){
                maxLength = Math.max(maxLength, i+1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //if element is already exist then find length and 
            //if it is max than length then update
            if(map.containsKey(rem)){
                length = i - map.get(rem);
                maxLength = Math.max(maxLength, length);
            }
            //put elements into map
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int n = arr.length;
        int k = 5;
        int result = findLongestArr2(arr, n, k);
        System.out.println(result);

    }
}
