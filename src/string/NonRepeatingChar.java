package src.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class NonRepeatingChar {

    public static int first_non_repating_character(String str){

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char ch : chars){
            // If the key is present in the Map, it returns the corresponding value.
            // If the key is not present, it returns a default value that you provide.
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        for (int i = 0; i<chars.length; i++){
            char ch = chars[i];
            if (map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(first_non_repating_character("racecars"));

        System.out.println(first_non_repating_character("ababab"));

    }
}
