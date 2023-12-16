package newtype.visitor;

public class Nil<E> implements List<E> {

    @Override
    public void accept(ListVisitor<E> visitor) {
        visitor.visit(this);
    }
}
