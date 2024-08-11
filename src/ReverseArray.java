public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.print("Unreverse array :");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n Reverse array :");
        reverseArray(array);

    }
    public static void reverseArray(int[] array){
        //logic to reverse the array
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        //print reversed array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
