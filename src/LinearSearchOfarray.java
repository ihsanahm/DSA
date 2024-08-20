import java.util.Scanner;

public class LinearSearchOfarray {
    public static void main(String[] args) {
        int [] array={1,2,33,44,55,66,77,8,9,11};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search :");
        int target=input.nextInt();
        boolean found=false;
        for (int i=0; i<array.length; i++) {
            if (array[i]==target)
            {
                found=true;
                System.out.println("Element found at index "+i+"Number Is " + array[i]);
                break;
            }

        }
        if (!found){
            System.out.println("Element not found in the array");
        }

    }
}
