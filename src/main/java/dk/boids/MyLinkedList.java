package dk.boids;

public class MyLinkedList<T> implements MyList<T> {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        public T data;
        public Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean add(T element) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public boolean remove(T other) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public T get(int index) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public T set(int index, T element) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public boolean contains(Object o) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public int size() {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Not implemented yet!");
    }
}
