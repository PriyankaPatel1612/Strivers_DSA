public class FibbonaciSeries {
    public static void main(String[] args) {
        //approach1
        printFibbonaciSeries(6);
        System.out.println();
        //approach2
        generateFibb(5);
    }

    //------------approach1--------------//
    static void printFibbonaciSeries(int n){
        System.out.print(0 + " " + 1 + " ");
        recuFuction(n,0,1);
    }

    static void recuFuction(int n, int a, int b){
        if(n<3)
        return;
        
        int c = a+b;
        System.out.print(c + " ");
        a = b;
        b = c;
        recuFuction(n-1, a, b);
    }

    //------------approach2--------------//
    static int[] generateFibb(int n){
    
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        recuFuction2(arr, n, 0, 1);
        //print array
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static void recuFuction2(int[] arr, int n, int a, int b){
        if(n<3)
        return;
        int temp = a + b;

        arr[arr.length-(n-2)] = temp;
        a = b;
        b = temp;
        recuFuction2(arr, n-1, a, b);
    }
}
