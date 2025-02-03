public class RearrangeBySign {
    static int[] rearrangeElementsBySign(int[] arr){
        int posIdx = 0 , negIdx = 1;
        int n = arr.length;
        int[] arr2 = new int[n];
        for(int i=0 ; i<n ; i++){
            if(arr[i]>0){
                arr2[posIdx] = arr[i];
                posIdx+=2;
            }else{
                arr2[negIdx] = arr[i];
                negIdx+=2;
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr2[i] + " ");
        }
        return arr2; 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-5};
        rearrangeElementsBySign(arr);
        
    }
}
