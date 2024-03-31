package src.stack;

import java.util.Stack;

/**
 * @author giraykaleli
 *
 * In this part, we will create a string which has open-close brackets --> "{()}, {(], }([" etc.
 *
 * Then, try to check whether there is a macth or not by using stack which is provided in Java Library
 */
public class MatchingBrackets {

    public boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if ( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char top = stack.peek(); // we will compare with c
                    if ( (c == ')') && (top == '(') || (c == '}') && (top == '{') ||  (c == ']') && (top == '[') ){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String first = "{(]";
        String second = "}([";
        String third = "{()}";

        MatchingBrackets match = new MatchingBrackets();

        System.out.println("First string ---> {(] = " + match.isValid(first));
        System.out.println("Second string ---> }([ = " + match.isValid(second));
        System.out.println("Third string ---> {()} = " + match.isValid(third));




    }




















}
