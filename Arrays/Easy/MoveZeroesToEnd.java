public class MoveZeroesToEnd {
    //selftested/optimized time-O(n),space-O(1)
    static void moveZeroes(int[] arr){
        int n = arr.length;
        int i = -1;
        //find 0th element
        for(int k=0 ; k<n ; k++){
            if(arr[k]==0){
                i=k;
                break;
            }
        }
        //if there is no zero element
        if(i==-1)
        return;
        //move zerores 
        int j = i+1;
        while(j<n){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        moveZeroes(arr);
        //print
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
