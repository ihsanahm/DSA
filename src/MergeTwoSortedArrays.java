public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,3,4,};
        int[] arr2 = {2,4,5, 5, 6};
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = mergeTwoSortedArray(arr1, m, arr2, n);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int m, int[] arr2, int n) {
        int[] mergedArray = new int[m + n];
        int i = m - 1; // index for arr1
        int j = n - 1; // index for arr2
        int k = m + n - 1; // index for mergedArray

        // Merge the arrays from the back to the front
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                mergedArray[k] = arr1[i];
                i--;
            } else {
                mergedArray[k] = arr2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements of arr1, if any
        while (i >= 0) {
            mergedArray[k] = arr1[i];
            i--;
            k--;
        }

        // Copy remaining elements of arr2, if any
        while (j >= 0) {
            mergedArray[k] = arr2[j];
            j--;
            k--;
        }

        return mergedArray;
    }
}
