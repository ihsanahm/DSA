public class recursionProblem {
    public static void main(String[] args) {
        print1(1);
        System.out.println("\nNow recursive the number \n");
        print (5);
    }
    public static void print(int n) {
        if (n <= 0) {

            return;
        }
        System.out.println(n);
        print(n - 1); // recursive call to print numbers in reverse order
    }
    public static void print1(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print1(n + 1); // recursive call to print numbers in increasing order
    }
}
