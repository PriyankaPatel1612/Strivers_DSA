import java.lang.Math;
public class SqrtOfNum{

    //selftested
    public static int findSqrtOfNum(int num){
       //convert num to double to find square root
       double d = Double.valueOf((Math.sqrt(num)));
       //check if it is integer or double
       if(num==(int)d){
        return (int)d;      //if integer then it is perfect square
       }else{
        return (int)Math.floor(d);      //if double then then return the floor value
       }
    }

    //optimized
    public static int findSqrtOfNum2(int num){
        int low = 1;
        int high = num;
        double mid;
        int ans = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            double sqrt = mid*mid;
            if(sqrt<=(double)num){
                ans = (int)mid;
                low = (int)mid+1;
            }else{
                high = (int)mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 11;
        int res = findSqrtOfNum2(num);
        System.out.println(res);
    }
}