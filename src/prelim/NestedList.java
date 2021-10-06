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

    public E get(int node){
        if (isEmpty()) return null;
        if (node < 0 || node >= getSize()) throw new IndexOutOfBoundsException("Out of bounds");
        Node<E> current = head;
        int n = 0;
        while (n < node){
            current = current.getNext();
            n++;
        }
        return current.getElement();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        addTail(data);
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        if(search(data)) return data;
        else throw new NoSuchElementException("No element in the list");
    }

    @Override
    public boolean delete(E data) {
        return search(data);
    }

    @Override
    public boolean search(E data) {
        Node<E> current = head;     // copy the head of the list to current
        for (int node = 0; node < getSize(); node++){       // traverse to all nodes
            if (current.getElement().equals(data)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }// end search method


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
