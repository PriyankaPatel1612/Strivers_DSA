public class FindNumAppearOnceAndOtherTwice {
    //optimized
    static int findNumAppearedOnce(int[] nums){
        int xor = 0;
        for(int i=0 ; i<nums.length ; i++){
            xor = xor ^ nums[i];
            System.out.println(xor);
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,1,1};
        findNumAppearedOnce(arr);
    }
}
