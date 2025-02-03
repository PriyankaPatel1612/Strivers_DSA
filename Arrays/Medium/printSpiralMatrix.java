import java.util.ArrayList;
import java.util.List;

public class printSpiralMatrix {
    static void printMatrix(int[][] arr){
    
        int n=arr[0].length;
        int m=arr.length;
        int top=0, left=0, right=n-1, bottom=m-1;

        List<Integer> list = new ArrayList<>();

        //traverse until left <= right and top<=bottom
        while(left<=right && top<=bottom){

        //print left to right
        for(int i=left ; i<=right ; i++){
            list.add(arr[top][i]);
        } 
        top++;       //increase top

        //print top to bottom
        for(int i=top ; i<=bottom ; i++){
            list.add(arr[i][right]);
        }
        right--;       //decrease right

        //print right to left
        if (top <= bottom) {         //corner case
            for(int i=right ; i>=left ; i--){
                list.add(arr[bottom][i]);
            }
        }
        bottom--;      //decrease bottom

        //print bottom to top
        if(left<=right){       //corner case
            for(int i=bottom ; i>=top ; i--){
                list.add(arr[i][left]);
            }
        }
        left++;        //increase left
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        printMatrix(arr);
    }
}
