package arrayManipulation;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int array[] = {1,2,0,3,0,4,5,0,6,0};
        int nonZeroPointer = 0;
        int lastIndex = array.length;
        for(int i = 0; i < lastIndex; i++){
            if(array[i] != 0) {
                array[nonZeroPointer] = array[i];
                nonZeroPointer++;
            }
        }
        for (int j = nonZeroPointer; j < lastIndex; j++) {
            array[nonZeroPointer] = 0;
            nonZeroPointer++;
        }

        Arrays.stream(array).forEach(System.out::print);
    }
}
