package baseline.dataoriented;

public class ListOps {

    public static int rank(List<?> list) {
        return switch (list) {
            case Nil() -> 0;
            case Cons(var _, var tail) -> 1 + rank(tail);
        };
    }
}
