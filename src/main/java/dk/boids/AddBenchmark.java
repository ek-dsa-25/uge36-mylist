package dk.boids;

public class AddBenchmark {

    public static void main(String[] args) {
        benchmarkAdd();
    }

    public static void benchmarkAdd() {
        int[] sizes = {2000, 1000, 5000, 10000, 20000, 50000};

        System.out.println("Benchmark af add() metoden - O(n) kompleksitet");
        System.out.println("Størrelse\tTid (ms)\tTid per element (ns)");

        for (int size : sizes) {
            MyLinkedList<Integer> list = new MyLinkedList<>();

            long startTime = System.nanoTime();

            for (int i = 0; i < size; i++) {
                list.add(i);
            }

            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            long timePerElement = totalTime / size;

            System.out.printf("%d\t\t%.2f\t\t%d%n",
                size,
                totalTime / 1_000_000.0,
                timePerElement
            );
        }
    }
}