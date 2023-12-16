package baseline.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void rank() {
        List<Integer> list =
                new Cons<>(1, new Cons<>(2, new Cons<>(3, new Nil<>())));
        assertEquals(3, RankVisitor.rank(list));
    }
}