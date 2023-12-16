package newop.objectoriented;

public class Cons<E> implements List<E> {

    private final E head;
    private final List<E> tail;

    public Cons(E head, List<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int rank() {
        return 1 + tail.rank();
    }

    @Override
    public String show() {
        return head.toString() + " " + tail.show();
    }
}
