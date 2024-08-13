import java.util.Scanner;

public class addElementInArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int [] arr=new int[3];
        for (int i=0; i<arr.length; i++) {
            System.out.print("Enter the value at index " + i + " : ");
            arr[i]=input.nextInt();
        }
        System.out.println("Print result: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Replace the value ");
        System.out.println("Enter the Index on which to replace the value :");
        int index=input.nextInt();
        System.out.print("Enter the value for replace  : ");
        int replaceValue=input.nextInt();

        if (index>=0&& index<arr.length){
            arr[index]=replaceValue;
            System.out.println("After replace the value: ");
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.println("array index out of bound ");
        }

    }
}
