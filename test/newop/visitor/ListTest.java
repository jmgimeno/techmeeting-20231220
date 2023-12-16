package newop.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List<Integer> list;

    @BeforeEach
    void fillList() {
        list = new Cons<>(3, new Cons<>(2, new Cons<>(1, new Nil<>())));
    }

    @Test
    void rank() {
        assertEquals(3, RankVisitor.rank(list));
    }

    @Test
    void show() {
        assertEquals("3 2 1 ", ShowVisitor.show(list));
    }
}