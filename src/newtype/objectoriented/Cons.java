package newtype.objectoriented;

public class Cons<E> implements List<E> {

    protected E head;
    protected List<E> tail;

    public Cons(E head, List<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int rank() {
        return 1 + tail.rank();
    }
}
