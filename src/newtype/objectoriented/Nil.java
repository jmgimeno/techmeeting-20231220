package newtype.objectoriented;

public class Nil<E> implements List<E> {

    @Override
    public int rank() {
        return 0;
    }
}
