package dk.boids;

public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int count;

    private static final int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean add(T element) {
        if (this.count >= this.array.length) {
            T[] newArray = (T[]) new Object[this.array.length * 2];
            for (int i = 0; i < this.array.length; i += 1) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        this.array[count] = element;
        this.count += 1;
        return true;
    }

    @Override
    public boolean remove(T other) {
        for (int i = 0; i < this.count; i += 1) {
            if (this.array[i] != null && this.array[i].equals(other)) {
                this.array[i] = null;

                // Flyt alle efterfølgende elementer én ned
                for (int j = i; j < this.count; j += 1) {
                    this.array[j] = this.array[j+1];
                }

                // Vi glemte at skrumpe arrayets logiske længde med 1
                this.count -= 1;

                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        // Hvis der er 0 elementer i mit arraylist, og jeg vil have element på
        // plads nr. 0, så skal det ikke kunne lade sig gøre. Derfor skal det
        // være >= jeg bruger her.
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException("" + index + " er ikke et gyldigt index (0 < index < " + this.count + ")");
        }

        return this.array[index];
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException("" + index + " er ikke et gyldigt index (0 < index < " + this.count + ")");
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.count; i += 1) {
            if (this.array[i] != null && this.array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

}
