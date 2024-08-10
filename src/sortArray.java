public class sortArray {
    public static void main(String[] args) {
        int [] array = {1,5,7,2,6,7,9,3,0};

        sort(array);
    }
    public static void sort(int[] array) {
        System.out.println("Unsorted array is  ");
        for (int i=0 ; i<array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
