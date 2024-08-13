

import java.util.Scanner;

public class mangeStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of stocks: ");
//        int num = input.nextInt();

        int [] stocks = new int [2];
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Total Stock " + i+":");
            int current=input.nextInt();

        }
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Total Stock: " + stocks[i]);

        }
        checkStock(stocks);

    }
    public static  void checkStock(int[] stocks){
        Scanner input = new Scanner(System.in );
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Total Stock: " + stocks[i]);

        }
        System.out.println("Sell the stocks ");
        System.out.println("Enter the index of the stocks : ");
        int index = input.nextInt();
        System.out.println("Enter the number of stocks ");
        int buyElements = input.nextInt();
        boolean isbuy=false;
        if(index >= 0 && index < stocks.length){
            for (int i = 0; i < stocks.length; i++) {
                if (stocks[i]==buyElements)
                {
                    stocks[i] = stocks[i] - buyElements;
                    isbuy=true;
                    break;
                }
            }
        }
        else {
            System.out.println("Stock is not buyable ");
        }

    }
}
