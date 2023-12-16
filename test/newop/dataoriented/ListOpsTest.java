package newop.dataoriented;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOpsTest {

    List<Integer> list;

    @BeforeEach
    void fillList() {
        list = new Cons<>(3, new Cons<>(2, new Cons<>(1, new Nil<>())));
    }

    @Test
    void rank() {
        assertEquals(3, ListOps.rank(list));
    }

    @Test
    void show() {
        assertEquals("3 2 1 ", ListOps.show(list));
    }
}