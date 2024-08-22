import java.util.Arrays;

public class removeDuplicateArrayValue {
    public static void main(String[] args) {

            int [] array={1,2,3,4,5,6,1,2,3,};
             duplicate(array);
        }
        public static void duplicate(int[] array){
            for (int i = 0 ; i < array.length ; i++ ){
                boolean isduplicate=false;
                for (int j = 0 ; j < i ; j++){
                    if( array[i] == array[j] ){
                        isduplicate = true;
                        break;
                    }

                }
            }
        }
    }

