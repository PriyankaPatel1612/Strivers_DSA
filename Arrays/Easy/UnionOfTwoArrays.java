import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    // selftested
    static void findUnion(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int idx = 0;
        int[] unionArr = new int[n + m];
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                unionArr[idx] = arr1[i];
                idx++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionArr[idx] = arr2[j];
                idx++;
                j++;
            } else if (arr1[i] == arr2[j]) {
                unionArr[idx] = arr1[i];
                idx++;
                i++;
                j++;
            }
        }
        // for remaining elements
        while (i < n) {
            unionArr[idx++] = arr1[i++];
        }
        while (j < m) {
            unionArr[idx++] = arr2[j++];
        }
        for (int k = 0; k < unionArr.length; k++) {
            System.out.print(unionArr[k] + " ");
        }
    }

    // optimized
    static ArrayList<Integer> findUnion2(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
              if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
              i++;
            } else // case 3
            {
              if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
              j++;
            }
          }
          while (i < n) // IF any element left in arr1
          {
            if (union.get(union.size()-1) != arr1[i])
              union.add(arr1[i]);
            i++;
          }
          while (j < m) // If any elements left in arr2
          {
            if (union.get(union.size()-1) != arr2[j])
              union.add(arr2[j]);
            j++;
          }
          for (int k = 0; k < union.size(); k++) {
            System.out.print(union.get(k) + " ");
          }
          return union;
    }

    
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 5, 11, 12 };
        int n = arr1.length;
        int m = arr2.length;
        // findunion(arr1, arr2);
        findUnion2(arr1, arr2, n, m);
    }
}
