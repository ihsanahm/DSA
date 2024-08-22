public class duplicateArray {

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,1,2,2,3};
        duplicate(array);
    }
    public static void duplicate(int[] array){
        int count=0;
        for (int i = 0 ; i < array.length ; i++ ){
            boolean isduplicate=false;

            for (int j = 0 ; j < i ; j++){
                if( array[i] == array[j] ){
                    isduplicate = true;
                    count++;
                    continue;
                }
            }
            if(isduplicate){
                System.out.println("Number is : "+array[i]+" repeated is : "+count);
            }
            count=0;
        }
    }
}
