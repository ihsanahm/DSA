public class modifyTheElementOfarray {
    public static void main(String[] args) {
        int [] arra1={1,3,4,5,6,7,8,};

        System.out.println("After modify the element of");
       for (int num :arra1){
           System.out.println(num);
       }
        System.out.println();
        arra1[2]=99;
        int i=0,j=0;
        System.out.println("Before modify the element of");
        while (i>=0&&j<arra1.length-1) {
            System.out.println(arra1[i]);
            i++;
            j++;
        }

    }
}
