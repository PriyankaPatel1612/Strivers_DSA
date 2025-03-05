public class NthRootOfNum {
    public static int findNthRoot(int m, int n){
        //n = nth root
        int low = 1;
        int high = m;
        int mid;
        int ans = -1;
        //loop until all the values checked
        while (low<=high) {
            //finding mid
            mid=low+(high-low)/2;
            //finding nth time root of num(mid)
            int root = findRoot(n,mid);
            //if root value of mid is equal or less than m, then store ans and move right check remaining value
            if(root==m){
                return mid;
            }else if(root<m){
                low = mid+1;
            }else{     //if not then move left
                high = mid-1;
            }
        }
        return ans;
    }

    public static int findRoot(int n, int num){
        int root=1;
        for(int i=1 ; i<=n ; i++){
            root = root*num;
        }
        return root;
    }
    public static void main(String[] args) {
        int m = 14;
        int n = 1;
        int ans = findNthRoot(m, n);
        System.out.println(ans);
    }
}
