class SecondLargest{
    static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;
        int n = arr.length;

        if (n == 0 || n==1){
            return -1;
        }
        
        //for largest
        for(int i=0 ; i<n ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        //for second largest
        for(int i=0 ; i<n ; i++){
            if(arr[i]>s_largest && arr[i]<largest){
                s_largest = arr[i];
            }
        }
        return s_largest;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10};
        int s_largest = findSecondLargest(arr);
        System.out.println(s_largest);
    }
}