package arrayManipulation;

public class SecondHighestNumber {

    public static void main(String[] args) {

        int array[] = {1,29,4,6,5,7,3,8,7};
        int secondHighest = array[0];
        int max = array[0];
        for (int i : array) {
            if(max < i) { secondHighest = max; max = i; }
            else if(secondHighest < max && secondHighest < i) secondHighest = i;
        }

        System.out.println(secondHighest);
    }
}
