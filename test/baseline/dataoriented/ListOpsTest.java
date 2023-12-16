package baseline.dataoriented;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOpsTest {

    @Test
    void rank() {
        List<Integer> list =
                new Cons<>(1, new Cons<>(2, new Cons<>(2, new Nil<>())));
        assertEquals(3, ListOps.rank(list));
    }
}