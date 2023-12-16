package newtype.visitor;

public interface ListVisitor<E> {
    void visit(Nil<E> nil);
    void visit(Cons<E> cons);
    void visit(Wide<E> wide);
}
