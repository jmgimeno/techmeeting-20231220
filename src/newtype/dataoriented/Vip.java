package newtype.dataoriented;

public record Vip<E>(E head, List<E> tail) implements List<E> {
}
