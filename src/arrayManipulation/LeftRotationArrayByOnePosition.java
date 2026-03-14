package arrayManipulation;

import java.util.Arrays;

public class LeftRotationArrayByOnePosition {

    public int[] rightRotationArray(int array[]){
        int lastElement = array[array.length-1];
        for (int i = array.length-1; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
        return array;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        //input : 1,2,3,4,5 output : 5,1,2,3,4 - right rotation
        LeftRotationArrayByOnePosition obj = new LeftRotationArrayByOnePosition();
        Arrays.stream(obj.rightRotationArray(array)).forEach(System.out::print);
        System.out.println();
        //input : 1,2,3,4,5 output : 2,3,4,5,1 - left rotation
        int firstElement = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = firstElement;
        Arrays.stream(array).forEach(System.out::print);
    }
}
