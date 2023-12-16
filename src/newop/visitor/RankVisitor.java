package newop.visitor;

public class RankVisitor<E> implements ListVisitor<E> {

    static <E> int rank(List<E> list) {
        var rankVisitor = new RankVisitor<E>();
        list.accept(rankVisitor);
        return rankVisitor.rank;
    }

    private int rank = 0;

    @Override
    public void visit(Nil<E> nil) {
    }

    @Override
    public void visit(Cons<E> cons) {
        rank += 1;
        cons.getTail().accept(this);
    }
}
