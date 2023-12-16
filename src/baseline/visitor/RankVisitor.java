package baseline.visitor;

public class RankVisitor<E> implements ListVisitor<E> {

    static <E> int rank(List<E> list) {
        var visitor = new RankVisitor<E>();
        list.accept(visitor);
        return visitor.rank;
    }

    private int rank = 0;

    private RankVisitor() {}

    @Override
    public void visit(Nil<E> nil) {
    }

    @Override
    public void visit(Cons<E> cons) {
        rank += 1;
        cons.getTail().accept(this);
    }
}
