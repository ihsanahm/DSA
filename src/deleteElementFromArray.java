import java.util.Scanner;

public class deleteElementFromArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,8,9,21,45,66,77};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        delete(arr);
        System.out.println("After deleting element");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int delete(int[] arr){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number for delete :");
        int Delete=input.nextInt();
        for (int i=0; i<arr.length; i++){
            if(arr[i]==Delete){
                   arr[arr.length-1]=0;
                    System.out.println("Element deleted successfully");
                    break;


            }

        }        return arr.length-1;
    }
}
