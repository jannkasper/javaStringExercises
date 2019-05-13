package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.LongestPalindromeSubstring;

import static org.junit.Assert.*;

public class LongestPalindromeSubstringTest {
    private LongestPalindromeSubstring longestPalindromeSubstring;
    @Before
    public void init(){
        longestPalindromeSubstring = new LongestPalindromeSubstring();
    }
    @Test
    public void test1() {
        assertEquals("abbccbba", longestPalindromeSubstring.findLongestPalindrome("abbccbba"));
    }

    @Test
    public void test2() {
        assertEquals("brownfoxxofnworb", longestPalindromeSubstring.findLongestPalindrome("thequickbrownfoxxofnworbquickthe"));
    }

    @Test
    public void test3() {
        assertEquals("", longestPalindromeSubstring.findLongestPalindrome("randomWord"));
    }


}