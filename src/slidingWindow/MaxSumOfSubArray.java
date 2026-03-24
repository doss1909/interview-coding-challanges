package slidingWindow;

public class MaxSumOfSubArray {

    //input : {1,2,3,4,5,6,7,8,12,3,4}, 3 - output : 27
    static int max(int a, int b){
        return a > b ? a : b;
    }
    static int maxSumOfSubArrray(int array[], int window_size){
        if(array.length == 0 && array.length < window_size) return -1;
        int sum = 0, max_sum = 0;
        for (int i = 0; i < window_size; i++) {
            sum += array[i];
        }
        if(max_sum < sum) max_sum = sum;
        for (int i = window_size; i < array.length; i++) {
            sum += array[i] - array[i - window_size];
            max_sum = max(sum, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumOfSubArrray(new int[]{1,2,3,4,5,6,7,8,12}, 3));
    }
}
