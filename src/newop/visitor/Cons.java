package newop.visitor;

public class Cons<E> implements List<E> {

    private final E head;
    private final List<E> tail;

    public Cons(E head, List<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public E getHead() {
        return head;
    }

    public List<E> getTail() {
        return tail;
    }

    @Override
    public void accept(ListVisitor<E> visitor) {
        visitor.visit(this);
    }
}
