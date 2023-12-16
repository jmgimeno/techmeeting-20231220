package newtype.objectoriented;

public class Vip<E> extends Cons<E> {

    public Vip(E head, List<E> tail) {
        super(head, tail);
    }

    @Override
    public int rank() {
        return 1 + super.rank();
    }
}
