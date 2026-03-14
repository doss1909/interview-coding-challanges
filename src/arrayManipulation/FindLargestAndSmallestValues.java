package arrayManipulation;

public class FindLargestAndSmallestValues {

    public static void main(String[] args) {
        int array[] = {1,2,0,3,0,4,5,0,-6,10};
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) min = array[i];
            if(max < array[i]) max = array[i];
        }
        System.out.println(min +" "+max);
    }
}
