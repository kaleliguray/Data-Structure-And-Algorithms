package src.stack;

import java.util.Stack;

/**
 * @author giraykaleli
 *
 * We reverse the string by using Stack
 */

public class StringReverse_Stack {

    public static void main(String[] args) {

        String str = "ABCDE";

        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();

        for (char word: chars) {
            stack.push(word);
        }

        for (int i=0; i<chars.length; i++){
            chars[i] = stack.pop();
            System.out.print(chars[i]);
        }







    }


}
