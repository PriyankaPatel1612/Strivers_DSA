import java.util.ArrayList;
import java.util.List;
class ProgramtoGeneratePascalsTriangle{

    //variation 1
    static void printSpecificElementInPasacalsTriangle(int n, int r, int c){
        
        //n=totalRows c=col r=row print cr position element
        //nCr == r-1Cc-1  == r!/c!*(r-c)! == digits-r
        //print element
        int res = findnCr(r-1, c-1);
        System.out.println(res);
    }

     //find element using nCr formula
     static int findnCr(int n, int r){
        int res = 1;
        for(int i=0 ; i<r ; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }

    //variation 2
    static void printNthRowInPascalTriangle(int row){
        //naive approach
        // for(int i=0 ; i<n; i++){
        //     System.out.print(findnCr(n-1, i) + " ");
        // }

        //optimal
        System.out.print("1 ");
        int res = 1;
        for(int i=1 ; i<row ; i++){
            res = res * (row-i);
            res = res / (i);
            System.out.print(res + " ");
        }
        System.out.println();
    }

    //variation 3
    static List<List<Integer>> printPascalsTriangle(int n, int r, int c){
        //resultant list
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n ; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    //generate nth row
    static List<Integer> generateRow(int row){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int res = 1;
        for(int i=1 ; i<row ; i++){
            res = res * (row-i);
            res = res / (i);
            list.add(res);
        }
        return list;
    }
 
    //main
    public static void main(String[] args) {

        //given
        int n=5, r=4, c=3;

        //variation 1
        //n=totalRows c=col r=row print cr position element
        printSpecificElementInPasacalsTriangle(n, r, c);

        //variation 2
        //print nth row
        int row = 4;
        printNthRowInPascalTriangle(row);

        //variation 3
        //print first n rows
        List<List<Integer>> ans = printPascalsTriangle(n, r, c);
        System.out.println(ans);

        //output
        /*
         * 1 
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         */
        /*
         *          00
         *       10  11
         *     20  21  22
         *   30  31  32  33
         * 40  41  42  43  44
         */
    }
}