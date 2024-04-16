package src.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class LengthOfLongestSubstring {

    public static int length_of_longest_substring(String str){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end=0; end<str.length(); end++){
            char rightChar = str.charAt(end);
            if (map.containsKey(rightChar)){
                start = Math.max(start, map.get(rightChar) + 1);
            }
            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        String s = "pwwkw";

        System.out.println(length_of_longest_substring(s));


    }


}



























