public class FindOccurance {
    public static void findOccurances(int[] arr, int target, int n){
       int low = 0; 
       int high = n-1;
       int count = 0;
       int firstOcc = firstOccurance(arr, target, low, high);
       int lastOcc = lastOccurance(arr, target, low, high);
      
       //if target element is not present in array
       if(firstOcc==-1 && lastOcc==-1){
        System.out.println("0");
       }
       
       //count the elements
       for(int i=firstOcc ; i<=lastOcc ; i++){
       count++;
       }

       System.out.println(count);
    }

    //find first occurence
    public static int firstOccurance(int[] arr, int target, int low, int high){
        int mid;
        int res=-1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                res = mid;
                high = mid -1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }

    //find second occurence
    public static int lastOccurance(int[] arr, int target, int low, int high){
        int mid;
        int res=-1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                res = mid;
                low = mid + 1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }

    //main
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,2 ,2 ,2 ,2 ,3};
        int x = 2;
        int n = arr.length;
        findOccurances(arr, x, n);
    }
}
