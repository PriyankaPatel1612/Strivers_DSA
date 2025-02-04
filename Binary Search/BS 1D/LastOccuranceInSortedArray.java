public class LastOccuranceInSortedArray {
    public static void findFirstAndLastOccurance(int[] arr, int target, int n){
        int res[] = new int[2];
        res[0] = findStart(arr, target, n);
        res[1] = findEnd(arr, target, n);
        System.out.println(res[0] + " " + res[1]);
    }

    //find first Occurance
    public static int findStart(int[] arr, int target, int n){
        int high = n-1;
        int low = 0;
        int mid;
        int firstOccur = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                firstOccur = mid;
                high = mid - 1;
            }else if(arr[mid]>target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return firstOccur;
    }

    //find Last Occurance
    public static int findEnd(int[] arr, int target, int n){
        int high = n-1;
        int low = 0;
        int mid;
        int lastOccur = -1; 
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                lastOccur = mid;
                low = mid + 1; 
            }else if(arr[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return lastOccur;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int n = arr.length;
        findFirstAndLastOccurance(arr, target, n);
    }
}
