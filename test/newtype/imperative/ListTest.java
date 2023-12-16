package newtype.imperative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void rank() {
        var list = new List<Integer>();
        List.add(list, 1);
        List.addVip(list, 2);
        List.add(list, 3);
        assertEquals(4, List.rank(list));
    }

}