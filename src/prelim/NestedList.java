package prelim;

import java.util.NoSuchElementException;

public class NestedList<E> implements MyList<E>{

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    NestedList(){

    }

    NestedList(E e){
        new Node<E>(e);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        // TODO insert method
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        // TODO getElement method
        return null;
    }

    @Override
    public boolean delete(E data) {
        // TODO delete method
        return false;
    }

    @Override
    public boolean search(E data) {
        // TODO search method
        return false;
    }


    private static class Node<E> {

        E element;
        Node<E> next;
        Node<E> prev;

        Node(){

        }

        Node(Node<E> p, E e, Node<E> n){
            prev = p;
            element = e;
            next = n;
        }

        Node(E e){
            element = e;
        }

        private Node<E> getNext() {
            return next;
        }

        private void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    } // end of Node class

}// end of prelim.NestedList class
