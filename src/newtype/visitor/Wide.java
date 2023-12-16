package newtype.visitor;

    public class Wide<E> extends Cons<E> {

        public Wide(E head, List<E> tail) {
            super(head, tail);
        }

        @Override
        public void accept(ListVisitor<E> visitor) {
            visitor.visit(this);
        }
    }