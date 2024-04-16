package src.string;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */
public class SubsequenceString {

    public static boolean subsequence(String str, String seq){
        int i = 0; // travel through str "abcde"
        int j = 0; // travel through seq "aec"

        while ( i<str.length() && j<seq.length()){

            if (str.charAt(i) == seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j == seq.length();
    }

    public static void main(String[] args) {

        System.out.println(subsequence("abcde", "aec"));

        System.out.println(subsequence("abcde", "ace"));

    }

}
