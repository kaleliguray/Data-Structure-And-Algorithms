package src.mathematic;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class ReverseNumber {

    public static long reverse(int number){
        boolean isNegative = number < 0;

        if (isNegative){
            number = number * -1; // changing sign of the number
        }

        long reverse = 0;
        int last_digit;

        while (number > 0){
            last_digit = number % 10; // assign last digit of the number ---> 123 --> 3
            reverse = reverse * 10 + last_digit; // 0 + 3 ---> 30 + 2 ---> 320 + 1 ---> 321
            number = number / 10;
        }
        return isNegative ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {

        int number = -1234;

        System.out.println(reverse(number));

    }
}
