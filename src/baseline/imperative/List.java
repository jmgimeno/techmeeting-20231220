package baseline.imperative;

final public class List<E> {

    Node<E> head = null;

    private static class Node<E> {
        final E e;
        final Node<E> next;

        Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }
    }

    private List() {

    }

    public static <E> List<E> make() {
        return new List<>();
    }

    public static <E> void add(List<E> list, E e) {
        list.head = new Node<>(e, list.head);
    }

    public static int rank(List<?> list) {
        int rank = 0;
        for (var node = list.head; node != null; node = node.next)
            rank += 1;
        return rank;
    }
}
