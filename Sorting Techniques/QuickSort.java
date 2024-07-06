public class QuickSort {

    // Partition method
    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l, j = h;
        while (i < j) {
            while (i < h && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    // QuickSort method
    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pidx = partition(arr, l, h);
            quickSort(arr, l, pidx - 1);
            quickSort(arr, pidx + 1, h);
        }
    }

    // Swap method
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 15, 6, 3, 9, 16};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}