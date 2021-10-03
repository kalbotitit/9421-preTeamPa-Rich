package prelim;

import java.util.NoSuchElementException;

public interface MyList<E> {
    int getSize();
    void insert(E data) throws ListOverflowException;
    E getElement(E data) throws NoSuchElementException;
    boolean delete(E data);
    boolean search(E data);
}
