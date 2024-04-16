package src.dynamicProgramming;

public class FibonacciSeries {

    /**
     * We use Recursion and Optimal Substructure for this method
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


    public static int fib2(int n){
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i=2; i<=n; i++){
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }

    public static void main(String[] args) {

        int result = fib(5);

        System.out.println("*** Dynamic Programming - Fibonacci Example - Method 1 ***");
        System.out.println("Fibonacci : " + result);

        System.out.println("*** Dynamic Programming - Fibonacci Example - Method 2 ***");
        result = fib2(5);
        System.out.println("Fibonacci : " + result);
    }

}
