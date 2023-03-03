import java.util.Map;

/*
 * The Sorter class is the context in the strategy pattern.
 * It has a reference to a SortingStrategy object and uses that object for sorting.
 * It can change the sorting strategy at runtime.
 * @author rasmushy
 */
public class Sorter {
    private final Map<String, SortingStrategy> strategies; // available strategies
    private SortingStrategy strategy; // the strategy to use

    public Sorter() {
        strategies = Map.of("mergesort", new MergeSort(), "quicksort", new QuickSort(), "bubblesort", new BubbleSort());
    }

    public void sort(int[] arr) {
        if (strategy == null) {
            return;
        }
        // time the sorting algorithm
        long startTime = System.nanoTime();
        strategy.sort(arr);
        long endTime = System.nanoTime();
        System.out.println(strategy.toString() + " took " + (endTime - startTime) + " ns");
    }

    public void setStrategy(String strategyName) {
        if (!strategies.containsKey(strategyName.toLowerCase())) {
            System.out.println("Unknown strategy\n");
            this.strategy = null;
            return;
        }
        this.strategy = strategies.get(strategyName.toLowerCase());
    }

    public Map<String, SortingStrategy> getStrategies() {
        return strategies;
    }

    public String getStrategyNames() {
        return "Available strategies: " + strategies.keySet();
    }
}
