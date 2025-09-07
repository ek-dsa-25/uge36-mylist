package dk.boids;

public class AddBenchmark {

    public static void main(String[] args) {
        System.out.println("=== Sammenligning af MyArrayList (+1 growth) vs MyLinkedList ===\n");
        benchmarkMyLinkedList();
        System.out.println();
        benchmarkMyArrayList();
    }

    public static void benchmarkMyLinkedList() {
        int[] sizes = {1000, 2000, 5000, 10000, 20000, 50000};

        System.out.println("MyLinkedList - O(1) add kompleksitet");
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

    public static void benchmarkMyArrayList() {
        int[] sizes = {1000, 2000, 5000, 10000, 20000};

        System.out.println("MyArrayList - O(n²) add kompleksitet (pga. +1 growth)");
        System.out.println("Størrelse\tTid (ms)\tTid per element (ns)");

        for (int size : sizes) {
            MyArrayList<Integer> list = new MyArrayList<>();

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
        
        System.out.println("\nNote: 50000 elementer udeladt for MyArrayList da det ville tage for lang tid!");
        System.out.println("Med +1 growth skal arrayet kopieres ved hver resize → O(n²) kompleksitet");
    }
}