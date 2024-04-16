package src.dynamicProgramming;

public class FibonacciSeries {

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

    public static void main(String[] args) {

        int result = fib(5);

        System.out.println("Fibonacci : " + result);
    }

}
