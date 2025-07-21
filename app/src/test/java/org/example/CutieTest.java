package example.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CutieTest {

    @Test
    public void testPuppy() {
        Cutie puppy = new Puppy();
        assertEquals("A little puppy with big, sad eyes", puppy.description());
        assertEquals(11, puppy.cutenessRating());
    }

    @Test
    public void testKitty() {
        Cutie kitty = new Kitty();
        assertEquals("A kitten with tiny paws and whiskers", kitty.description());
        assertEquals(10, kitty.cutenessRating());
    }

    @Test
    public void testMarmoset() {
        Cutie marmoset = new PygmyMarmoset();
        assertEquals("A teeny-tiny monkey with big eyes", marmoset.description());
        assertEquals(9, marmoset.cutenessRating());
    }
}
