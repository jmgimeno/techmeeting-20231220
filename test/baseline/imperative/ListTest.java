package baseline.imperative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void rank() {
        var list = List.<Integer>make();
        List.add(list, 1);
        List.add(list, 2);
        List.add(list, 3);
        assertEquals(3, List.rank(list));
    }

}