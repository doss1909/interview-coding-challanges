package arrayManipulation;

public class CheckIfArraySortedOrNot {

    public static boolean isArraySoretd(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int array[] = new int []{1,2,3,4,5,6,7,9,9,10};
        System.out.println(isArraySoretd(array));
    }
}
