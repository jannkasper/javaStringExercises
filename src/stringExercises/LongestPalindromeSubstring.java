package stringExercises;

public class LongestPalindromeSubstring {
    public String findLongestPalindrome(String word) {
        if (word == null || word.isEmpty())
            return null;
        for (int length = word.length(); length>0; length--){
            for (int start = 0; start <= word.length()-length; start++){
                if (palindromRecurencion(word.substring(start,start+length))){
                    return word.substring(start, start+length);
                }
            }
        }
        return "";
    }

    public boolean palindromRecurencion(String word) {

        if (word.length() == 1 || word.isEmpty())
            return false;
        if(word.length() == 2 && word.charAt(0) == word.charAt(1))
            return true;
        if (word.charAt(0) != word.charAt(word.length()-1))
            return false;

        return palindromRecurencion(word.substring(1,word.length()-1));

    }

}
