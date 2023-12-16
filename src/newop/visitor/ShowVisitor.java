package newop.visitor;

public class ShowVisitor<E> implements ListVisitor<E> {

    static <E> String show(List<E> list) {
        var showVisitor = new ShowVisitor<E>();
        list.accept(showVisitor);
        return showVisitor.show;
    }

    private String show = "";

    private ShowVisitor() {}

    @Override
    public void visit(Nil<E> nil) {
    }

    @Override
    public void visit(Cons<E> cons) {
        show += cons.getHead() + " ";
        cons.getTail().accept(this);
    }
}
