package numberChallenges;

public class FibonacciSeriesUsingRecursion {

    public int fibonacciSeriesUsingRecursion(int num){
        if(num <= 1) return num;

        return fibonacciSeriesUsingRecursion(num-1)+fibonacciSeriesUsingRecursion(num-2);
    }

    public static void main(String[] args) {
        FibonacciSeriesUsingRecursion obj = new FibonacciSeriesUsingRecursion();
        for (int i = 0; i < 10; i++) {
            System.out.print(obj.fibonacciSeriesUsingRecursion(i)+" ");
        }
    }

}
