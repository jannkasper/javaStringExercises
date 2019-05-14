package stringExercises;

import java.util.Arrays;

public class Anagram {
    public boolean checkAnagram (String text1, String text2) {

        if (text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty())
            return  false;

        char[] arr1 = text1.toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        char[] arr2 = text2.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (String.copyValueOf(arr1).equals(String.copyValueOf(arr2))) ? true : false;

    }
}
