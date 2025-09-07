package dk.boids;

interface MyList<T> {
    boolean add(T element);
    boolean remove(T o);
    T get(int index);
    T set(int index, T element);
    boolean contains(Object o);
    int size();
    boolean isEmpty();
}