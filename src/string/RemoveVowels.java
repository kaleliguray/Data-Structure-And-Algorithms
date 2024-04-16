package src.string;

import java.util.Set;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class RemoveVowels {

    public static String remove_vowels(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'); // you can change the vowels letters depends on your alphabet
        StringBuilder sb = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (Character ch : charArray){
            if (!vowels.contains(ch)){
                sb.append(ch); // appoint or add the character into the StringBuilder
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String example = "ice cream";
        System.out.println(example);
        System.out.println(remove_vowels(example));

    }
}
