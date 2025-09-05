package dk.boids;

public class MyLinkedList<T> implements MyList<T> {
    private Node head;

    public MyLinkedList() {
        this.head = null;
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
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        int counter = 0;
        Node current = this.head;
        while (current != null) {
            counter += 1;
            current = current.next;
        }

        return counter;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
