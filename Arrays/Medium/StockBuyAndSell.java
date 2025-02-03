public class StockBuyAndSell {

    //optimal solution
    static int BuyAndSellStocks(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }else if (arr[i]-minPrice > maxProfit){
                maxProfit = arr[i]-minPrice;
            }
        }
        return maxProfit;
    }

    //my appraoch
    static int BuyAndSellStocks2(int[] arr){
        int n = arr.length;
        // int stprice = 0;
        int price = 0;
        for(int i=0 ; i<n-1 ; i++){
            // stprice = arr[i];
            for(int j=i+1 ; j<n ; j++){
                int curPrice = arr[j]-arr[i];
                // System.out.println(curPrice);
                if(0 < curPrice){
                    price = Math.max(price, curPrice);
                }
            }
        }
        return price;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(arr));
        
    }
}

/*
 * find max
 * store index
 * for(int i=0 ; i<n ; i++){
 *   if(arr[i]>max){
 *     max = arr[i];
 *     maxIdx = i;
 *     }
 * }

 * 
 * if it is equal to last
 * if(maxIdx==n-1)
 * return 0;
 * 
 * 2 4 1
 * find min than max
 * for(int j=n-2 ; j>=0 ; j--){
 *   if(arr[j]<max && arr[j]<min){
 *       min = arr[i];
 *       minIdx = j;
 *    }
 * }
 * 
 *    
 * 
 */