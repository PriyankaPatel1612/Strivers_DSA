/*

Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.

Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.

Input Format:
 N = 4, a[] = {7, 15, 6, 3}, h = 8
Result:
 5
 */
public class KokoEatingBananas {

    //optimized
    public static int minEatingSpeed(int[] piles, int h){
        int n = piles.length;
        int low = 1;
        int high= Integer.MIN_VALUE;
        //find max
        for(int i=0 ; i<n ; i++){
            high = Math.max(piles[i], high);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int totalHours = findTime(piles,mid);
            if(totalHours<=h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
     public static int findTime(int[] piles, int perHour){
        int n = piles.length;
        int hourSum = 0;
        for(int i=0 ; i<n ; i++){
            hourSum += Math.ceil((double)piles[i]/(double)perHour);
        }
        return hourSum;
    }
    
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int hours = 5;
        int minBananasPerHour = minEatingSpeed(piles, hours);
        System.out.println(minBananasPerHour);
    }

    /*
    
    //selftested (time limit exceeded, not Accepted)

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        //find max bananas in a pile
        int maxB = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            maxB = Math.max(piles[i], maxB);
        }
       
        int i=0;
        for(i=1 ; i<=maxB ; i++) {
            int time = findTime(piles, i);
            if(time<=h){
                return i;
            }
        }
        return i;
    }

    public static int findTime(int[] piles, int perHour){
        int n = piles.length;
        double hourSum=0;
        double calctime = 0;
        for(int i=0 ; i<n ; i++){
            calctime = Math.ceil((double)piles[i]/(double)perHour);
            hourSum = hourSum + calctime;
        }
        return (int)hourSum;
    }
    */

}
