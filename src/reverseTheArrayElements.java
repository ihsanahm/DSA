public class reverseTheArrayElements {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
       swap(arr);
        System.out.println("\n" +
                "Reverse the array");
        reverseArray(arr);

    }
    public static void reverseArray(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static  void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
