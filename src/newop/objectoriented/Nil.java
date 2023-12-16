package newop.objectoriented;

public class Nil<E> implements List<E> {

    @Override
    public int rank() {
        return 0;
    }

    @Override
    public String show() {
        return "";
    }
}
