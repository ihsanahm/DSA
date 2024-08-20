import java.util.Scanner;

public class binarySearchOfarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a binary search ");
        int target =input.nextInt();
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int binarySearch( int[] arr, int target ){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target) {
                return mid;

            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

}
