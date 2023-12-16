package newtype.dataoriented;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOpsTest {

    @Test
    void rank() {
        List<Integer> list =
                new Cons<>(1, new Vip<>(2, new Cons<>(3, new Nil<>())));
        assertEquals(4, ListOps.rank(list));
    }
}