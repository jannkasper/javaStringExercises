package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.stringRemover;
import static org.junit.Assert.*;

public class stringRemoverTest {
    stringRemover stringRemover;

    @Before
    public void init() {
        stringRemover = new stringRemover();
    }
    @Test
    public void test1() {
        assertEquals("He World Java Users", stringRemover.removeText("Hello World Java Users","llo"));
    }

    @Test
    public void test2() {
        assertEquals("quickbrownfoxxofnworbquick", stringRemover.removeText("thequickbrownfoxxofnworbquickthe","the"));
    }

    @Test
    public void test3() {
        assertEquals("nana", stringRemover.removeText("bananabanana", "nana"));
    }
    @Test
    public void test4() {
        assertEquals(null, stringRemover.removeText(null,"the"));
    }

}