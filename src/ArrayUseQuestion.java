import java.util.Scanner;

public class ArrayUseQuestion {
    public static void main(String[] args) {
        System.out.println("Welcome to the ArrayUseQuestion class ");
        Scanner input = new Scanner(System.in);
        int []array=new  int [5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value at "+i+" Index of array : ");
            array[i]=input.nextInt();

        }
        System.out.println("\n\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" The value at "+i+" Index of array is : "+array[i]);


        }
    }
}
