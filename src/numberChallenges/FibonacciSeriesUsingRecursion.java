package numberChallenges;

import java.util.HashMap;

public class FibonacciSeriesUsingRecursion {

    public int fibonacciSeriesUsingRecursion(int num){
        if(num <= 1) return num;

        return fibonacciSeriesUsingRecursion(num-1)+fibonacciSeriesUsingRecursion(num-2);
    }
    /*
    fibonacci(5)
 ├── fibonacci(4)
 │    ├── fibonacci(3)
 │    │    ├── fibonacci(2)
 │    │    │    ├── fibonacci(1) = 1
 │    │    │    └── fibonacci(0) = 0
 │    │    └── fibonacci(1) = 1
 │    └── fibonacci(2)
 │         ├── fibonacci(1)
 │         └── fibonacci(0)
 └── fibonacci(3)
    Time Complexity: O(2^n)
    Space Complexity: O(n) (recursion stack)*/

    //optimized answer
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static int fibonacciOptimized(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        if (map.containsKey(n))
            return map.get(n);

        int result = fibonacciOptimized(n - 1) + fibonacciOptimized(n - 2);
        map.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        FibonacciSeriesUsingRecursion obj = new FibonacciSeriesUsingRecursion();
        for (int i = 0; i < 9; i++) {
            //System.out.print(obj.fibonacciSeriesUsingRecursion(i)+" ");
            System.out.print(obj.fibonacciOptimized(i)+" ");
        }
    }

}
