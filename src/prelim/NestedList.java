package prelim;

import java.util.NoSuchElementException;

public class NestedList<E> implements MyList<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    NestedList(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addHead(E h){
        Node<E> newNode = new Node<>(h, head);
        head = newNode;
        if(isEmpty()) tail = newNode;
        ++size;
    }

    public void addTail (E t){
        Node<E> newNode = new Node<>(t, null);
        if (isEmpty()) head = newNode;
        else tail.setNext(newNode);
        tail = newNode;
        ++size;
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

        Node(){

        }

        Node(E e, Node<E> n){
            element = e;
            next = n;
        }


        private Node<E> getNext() {
            return next;
        }

        private void setNext(Node<E> next) {
            this.next = next;
        }

        private void setElement(E e){
            element = e;
        }

        private E getElement(){
            return element;
        }

    } // end of Node class

}// end of prelim.NestedList class
