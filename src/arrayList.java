import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();

        // Initialize inner lists
        for (int i = 0; i < 5; i++) {
            arrlist.add(new ArrayList<Integer>());
        }

        // Example: Adding integers to the first inner list
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arrlist.get(0).add(input.nextInt());
        }
        // Example: Adding integers to the second inner list
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            arrlist.get(1).add(input.nextInt());
        }
        // Example: Adding integers to the third inner list
        System.out.println("Enter 7 integers:");
        for (int i = 0; i < 7; i++) {
            arrlist.get(2).add(input.nextInt());
        }
        // Example: Adding integers to the fourth inner list
        System.out.println("Enter 2 integers:");
        for (int i = 0; i < 2; i++) {
            arrlist.get(3).add(input.nextInt());
        }
        // Example: Adding integers to the five inner list
        System.out.println("Enter 9 integers:");
        for (int i = 0; i < 9; i++) {
            arrlist.get(3).add(input.nextInt());
        }


        // Print the list to verify
        System.out.println(arrlist);
    }
}
