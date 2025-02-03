class SortArray012{
    //selftested
    static void sortArray(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<=n-1 ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //print
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //optimal solution
    /*
     * dutch national flag algorithm
     * 0 to low-1    --> 0  
     * low to mid-1 --> 1
     * mid to high-1 --> random (unsorted)
     * high+1 to n-1 --> 2
     * three pointers -- low, mid, high
     *  low
     * { 2, 0, 2, 1, 1, 0 }
     *  mid            high-1
     * three cases--
     * 0--> swap(mid, low) low++ mid++
     * 1--> mid++
     * 2--> swap (mid, high-1) high-1-1
     */
    static void sortArray2(int[] arr){
        int n = arr.length;
        //pointers
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
                //swap
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                //swap
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        //print
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //optimal solution2
    static void sortArr3(int[] nums){
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        //count
        for(int i=0 ; i<n ; i++){
            if(nums[i]==0){
                countZero++;
            }else if(nums[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        int i=0;
        while(countZero>0){
            nums[i]=0;
            i++;
            countZero--;
        }
        while(countOne>0){
            nums[i]=1;
            i++; 
            countOne--;
        }
        while(countTwo>0){
            nums[i]=2;
            i++;
            countTwo--;
        }
         //print
         for(int j=0 ; j<n ; j++){
            System.out.print(nums[j]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        sortArr3(arr);
    }
}