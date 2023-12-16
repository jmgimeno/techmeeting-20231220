package newtype.visitor;

public class RankVisitor<E> implements ListVisitor<E> {

    static <E> int rank(List<E> list) {
        var rankVisitor = new RankVisitor<E>();
        list.accept(rankVisitor);
        return rankVisitor.rank;
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

    @Override
    public void visit(Wide<E> wide) {
        rank += 2;
        wide.getTail().accept(this);
    }
}
