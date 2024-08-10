import java.util.Scanner;

public class averageOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenth of an array :");
        int lenth=input.nextInt();
        int []arr=new int[lenth];
        for (int i=0; i<arr.length;i++) {
            System.out.print("Enter the value of an array: ");
            arr[i]=input.nextInt();
        }
        int sum=0;
        int average =0;
        for (int i=0; i<arr.length;i++) {
            System.out.println("The value of an array are : "+arr[i]);
            sum+=arr[i];

            average=sum/arr.length;

        }
        System.out.println("The sum of an array is : "+sum);
        System.out.println("The average of an array is : "+average);
    }
}
