package newop.dataoriented;

public record Cons<E>(E head, List<E> tail) implements List<E> { }
