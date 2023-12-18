package newtype.imperative;

final public class List<E> {

    Node<E> head = null;

    private static class Node<E> {
        private final E e;
        private final Node<E> next;
        private final boolean isVip;

        public Node(E e, Node<E> next, boolean isVip) {
            this.e = e;
            this.next = next;
            this.isVip = isVip;
        }
    }

    private List() {
    }

    public static <E> List<E> make() {
        return new List<>();
    }

    public static <E> void add(List<E> list, E e) {
        list.head = new Node<>(e, list.head, false);
    }

    public static <E> void addVip(List<E> list, E e) {
        list.head = new Node<>(e, list.head, true);
    }

    public static int rank(List<?> list) {
        int rank = 0;
        for (var node = list.head; node != null; node = node.next) {
            rank += node.isVip ? 2 : 1;
        }
        return rank;
    }
}
