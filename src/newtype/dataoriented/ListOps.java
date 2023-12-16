package newtype.dataoriented;

public class ListOps {

    public static <E> int rank(List<E> list) {
        return switch (list) {
            case Nil() -> 0;
            case Cons(var head, var tail) -> 1 + rank(tail);
            case Vip(var head, var tail) -> 2 + rank(tail);
        };
    }
}
