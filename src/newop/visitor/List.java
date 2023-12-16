package newop.visitor;

public interface List<E> {
    void accept(ListVisitor<E> visitor);
}

