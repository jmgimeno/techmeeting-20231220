package newop.dataoriented;

public class ListOps {

    public static int rank(List<?> list) {
        return switch (list) {
            case Nil() -> 0;
            case Cons(var _, var tail) -> 1 + rank(tail);
        };
    }

    public static String show(List<?> list) {
        return switch (list) {
            case Nil() -> "";
            case Cons(var head, var tail) -> head.toString() + " " + show(tail);
        };
    }
}
