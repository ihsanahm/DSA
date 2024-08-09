import java.util.Scanner;

public class StringInArray {
    public static void main(String[] args) {
        String[] str =new String[6];
        for (int i=0;i<str.length;i++)
        {
            Scanner input=new  Scanner(System.in);
            System.out.print("Enter the string here :");
            str[i]=input.nextLine();

        }
        for (String newstr:str)
        {

            System.out.print(newstr+". ");


        }

    }
}
