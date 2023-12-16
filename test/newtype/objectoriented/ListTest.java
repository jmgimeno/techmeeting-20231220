package newtype.objectoriented;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void rank() {
        List<Integer> list =
                new Cons<>(1, new Cons<>(2, new Vip<>(3, new Nil<>())));
        assertEquals(4, list.rank());
    }
}