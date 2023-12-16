package baseline.visitor;

public interface ListVisitor<E> {
    void visit(Nil<E> nil);
    void visit(Cons<E> cons);
}
