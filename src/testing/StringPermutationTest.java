package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.StringPermutation;
import stringExercises.StringRemover;

import static org.junit.Assert.*;

public class StringPermutationTest {
    StringPermutation stringPermutation;

    @Before
    public void init() {
        stringPermutation = new StringPermutation();
    }
    @Test
    public void test1() {
        assertEquals("[123, 132, 213, 231, 312, 321]", stringPermutation.permutation("123"));
    }
    @Test
    public void test2() {
        assertEquals(null, stringPermutation.permutation(""));
    }
    @Test
    public void test3() {
        assertEquals(null, stringPermutation.permutation(null));
    }

}