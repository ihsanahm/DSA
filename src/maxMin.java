import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
       int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <arr.length; i++){
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = input.nextInt();

        }
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Max element"+max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is :"+min);
    }
}
