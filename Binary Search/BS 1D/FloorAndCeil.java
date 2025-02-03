public class FloorAndCeil {
    static void findFloorAndCeil(int[] arr, int x){
       //floor - The floor of x is the largest element in the array which is smaller than or equal to x.
       // x>=? (largest in arr)
       //ceil - The ceiling of x is the smallest element in the array greater than or equal to x.
       //x<=?  (smallest in arr)
       int low = 0;
       int high = arr.length-1;
       int f = findFloor(arr, x, low, high);
       int c = findCeil(arr, x, low, high);
       System.out.println(f);
       System.out.println(c);
    }

    static int findFloor(int[] arr, int target, int low, int high){

        while(low<=high){
          if(arr[high]<=target){
            return arr[high];
          }else{
            high--;
          }
        }
        return-1;
        }
        static int findCeil(int[] arr, int target, int low, int high){
        
            while(low<=high){
              if(arr[low]>=target){
                return arr[low];
              }else{
                low++;
              }
            }
            return-1;
            }
    public static void main(String[] args) {
        int  arr[] ={3, 4, 4, 7, 8, 10};
        int x = 8;
        findFloorAndCeil(arr, x);
       
    }
}
