package src.dynamicProgramming;

public class FibonacciSeries {

    /**
     * We calculate the fibonacci series by using the Recursion and the Optimal Substructure Approach in this method
     * @param n
     * @return
     */
    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        int left = fib(n-1);
        int right = fib(n-2);

        return left + right;
    }

    /**
     * We calculate the fibonacci series by using the Bottom-Up Approach in this method
     * @param n
     * @return
     */
    public static int fib2(int n){
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i=2; i<=n; i++){
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }

    /**
     * We calculate the fibonacci series by using the Top-Down Approach in this method
     * // @param memo
     * @param n
     * @return
     */
    public static int fib3(int n){ // (int[] memo, int n) ---> if method argument is like that, please remove this ---> int[] memo = new int[n+1];
        int[] memo = new int[n+1];
        if (memo[n] == 0){
            if (n < 2){
                memo[n] = n; // this calculation is for 0 and 1
            } else {
                int left = fib3(n-1); // fib3(memo, n-1)
                int right = fib3(n-2); // fib2(memo, n-2)
                memo[n] = left + right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {

        int result = fib(5);

        System.out.println("*** Dynamic Programming - Fibonacci Example - Method 1 ***");
        System.out.println("Fibonacci : " + result);

        System.out.println("*** Dynamic Programming - Fibonacci Example - Method 2 ***");
        result = fib2(6);
        System.out.println("Fibonacci : " + result);

        System.out.println("*** Dynamic Programming - Fibonacci Example - Method 3 ***");
        result = fib3(7);
        System.out.println("Fibonacci : " + result);
    }

}
