package testing;

import org.junit.Before;
import org.junit.Test;
import stringExercises.Anagram;

import static org.junit.Assert.*;

public class AnagramTest {
    private Anagram anagram;

    @Before
    public void init() {
        anagram = new Anagram();
    }
    @Test
    public void test1() {
        assertEquals(true, anagram.checkAnagram("Army", "Mary"));
    }

    @Test
    public void test2() {
        assertEquals(true, anagram.checkAnagram("Dirty room", "Dormitory"));
    }

    @Test
    public void test3() {
        assertEquals(true, anagram.checkAnagram("The Morse Code", "Here comes dots"));
    }
    @Test
    public void test4() {
        assertEquals(true, anagram.checkAnagram("The Morse Codee", "Here comes dots"));
    }
    @Test
    public void test5() {
        assertEquals(true, anagram.checkAnagram("", "Here comes dots"));
    }
    @Test
    public void test6() {
        assertEquals(true, anagram.checkAnagram("The Morse Code", null));
    }


}