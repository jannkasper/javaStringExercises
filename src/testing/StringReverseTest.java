package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.StringReverse;

import static org.junit.Assert.*;

public class StringReverseTest {
    private StringReverse stringReverse;

    @Before
    public void init() {
        stringReverse = new StringReverse();
    }
    @Test
    public void test1() {
        assertEquals("cba", stringReverse.StringReverseExample("abc"));
    }
    @Test
    public void test2() {
        assertEquals(".cba ,cba", stringReverse.StringReverseExample("abc, abc."));
    }
    @Test
    public void test3() {
        assertEquals("", stringReverse.StringReverseExample(""));
    }
    @Test
    public void test4() {
        assertEquals(null, stringReverse.StringReverseExample(null));
    }

}