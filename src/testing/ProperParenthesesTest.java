package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.LongestPalindromeSubstring;
import stringExercises.ProperParentheses;

import static org.junit.Assert.*;

public class ProperParenthesesTest {
    ProperParentheses properParentheses;
    @Before
    public void init() {
        properParentheses = new ProperParentheses();
    }
    @Test
    public void test1() {
        assertEquals(true, properParentheses.checkParentheses("[(a+b)(c+15)]"));
    }

    @Test
    public void test2() {
        assertEquals(true, properParentheses.checkParentheses("[(15*d)+20+[(21*12)/(2*s)+15]+d]+19"));
    }

    @Test
    public void test3() {
        assertEquals(false, properParentheses.checkParentheses("[(a+15)*(14+(15+(s(20*12+55)+15)-10)]"));
    }
    @Test
    public void test4() {
        assertEquals(false, properParentheses.checkParentheses(null));
    }
    @Test
    public void test5() {
        assertEquals(false, properParentheses.checkParentheses(""));
    }
    @Test
    public void test6() {
        assertEquals(false, properParentheses.checkParentheses("([)]"));
    }

}