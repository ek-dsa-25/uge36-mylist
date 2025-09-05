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
        if (this.head == null) {
            this.head = new Node(element);
            return true;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(element);
        return true;
    }

    @Override
    public boolean remove(T other) {
        if (this.head == null) {
            return false;
        }

        if (this.head.data != null && this.head.data.equals(other)) {
            this.head = this.head.next;
            return true;
        }

        Node prev = this.head;
        Node current = this.head.next;
        while (current != null) {
            if (current.data != null && current.data.equals(other)) {
                prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }
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
