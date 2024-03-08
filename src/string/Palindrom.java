package src.string;

import java.util.Scanner;

public class Palindrom {

    /**
     * In the class, we will see a String's value if it is palindrome or not
     *
     * a palindrome is such as: "madam" <-reverse-> "madam", the values will be exactly the same
     *
     * 1. we will create a string value
     * 2. creating a char array
     * 3. split up String to a char and assign the char array
     * 4. by using a for loop to check whether every character is equal or not
     * 5. to do that we should start at the beginning of the array and end of it
     *
     */

    public static boolean isPalindrom(String word){

        char[] char_array = word.toCharArray();

        int start = 0;
        int end = char_array.length-1;

        while (start < end){

            if (char_array[start] != char_array[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        System.out.println("Is the \'" + word + "\' polindrom or not ?\n");

        if (isPalindrom(word)){
            System.out.println("The \'" + word + "\' is polindrom - " + word);
        } else {
            System.out.println("The \'" + word + "\' is not polindrom - " + word);
        }
        System.out.println();

        word = "that";

        System.out.println("Is the \'" + word + "\' polindrom or not ?\n");

        if (isPalindrom(word)){
            System.out.println("The \'" + word + "\' is polindrom - " + word);
        } else {
            System.out.println("The \'" + word + "\' is not polindrom - " + word);
        }
    }


}
