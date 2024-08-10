import java.util.Scanner;

public class ocurenceNumberArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int []array ={1,3,4,6,8,8,9,10,};
        System.out.print("Enter the to find how many times it occurces :");
        int target=input.nextInt();
        int count =0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==target)
            {
                count++;
            }
        }
        System.out.println("The target number is "+target+" and it is ocurence "+count+" times");



    }
}
