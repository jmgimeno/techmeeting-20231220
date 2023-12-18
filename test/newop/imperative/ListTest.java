package newop.imperative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

    List<Integer> list;

    @BeforeEach
    void fillList() {
        list = List.make();
        List.add(list, 1);
        List.add(list, 2);
        List.add(list, 3);
    }

    @Test
    void rank() {
        assertEquals(3, List.rank(list));
    }

    @Test
    void show() {
        assertEquals("3 2 1 ", List.show(list));
    }
}