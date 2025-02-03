public class FindUpperBound {
    static int findUpperBound(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int upper_bound = n;
        while(low<=high){
            int mid = (low+(high-low/2));
                if(arr[mid]>x){
                    upper_bound = mid;
                    //check for remaining
                    high = mid-1;
                }else{
                    low = mid+1;
                }
                System.out.println("ttttttttttttttttt");
           }
           return upper_bound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        int x = 2;
        int upper_bound = findUpperBound(arr, x);
        if(upper_bound==-1)
        System.out.println("not present");
        else
        System.out.println(upper_bound);
    }

}
