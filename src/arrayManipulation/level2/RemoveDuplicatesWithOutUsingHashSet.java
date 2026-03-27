package arrayManipulation.level2;

import java.util.Arrays;

public class RemoveDuplicatesWithOutUsingHashSet {

    public static void main(String[] args) {
        int array[] = {1,2,3,1,4,2,5,6,3,1,2,3,5,6,8,3,1};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if( array[i] != (-1) && array[i] == array[j]) array[j] = (-1);
            }
        }

        //shifting all (-1) to end of array
        int left = 0, right = 1;
        while (right < array.length){
            if(array[left] != -1) left++;
            if (array[right] != (-1)){
                array[left] = array[right];
                left++;
            }
            right++;
        }

        Arrays.stream(array).forEach(System.out::print);
    }
}
