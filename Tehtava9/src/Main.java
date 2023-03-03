import java.util.Arrays;
import java.util.Scanner;

/*
 * The Main class is the client in this strategy pattern example.
 * It creates a Sorter object and uses it to sort an array of random numbers.
 * It also provides a menu for the user to choose which sorting strategy to use.
 * @author rasmushy
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the sorting program!");
        System.out.println("Select size of array to sort: ");
        String size = scanner.nextLine();
        int[] generatedArr = generateArray(Integer.parseInt(size));
        Sorter sorter = new Sorter();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n*********\tMenu\t*********");
            System.out.println("Enter 'all' to sort with all strategies");
            System.out.println("Enter 'print' to print the array");
            System.out.println("Enter 'exit' to exit");
            System.out.println(sorter.getStrategyNames());
            System.out.print("Enter strategy name: ");
            String strategyName = scanner.nextLine();
            System.out.println();
            int[] array = Arrays.copyOf(generatedArr, generatedArr.length);
            switch (strategyName) {
                case "exit" -> exit = true;
                case "all" -> {
                    for (String strategy : sorter.getStrategies().keySet()) {
                        array = Arrays.copyOf(generatedArr, generatedArr.length);
                        sorter.setStrategy(strategy);
                        sorter.sort(array);
                    }
                }
                case "print" -> printNumbers(array);
                default -> {
                    sorter.setStrategy(strategyName);
                    sorter.sort(array);
                }
            }
        }
    }

    // generate an array of random numbers
    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    // print the array
    private static void printNumbers(int[] input) {
        for (int j : input) {
            if (j == input[input.length - 1]) {
                System.out.print(j);
                break;
            }
            System.out.print(j + ", ");
        }
        System.out.println("\n");
    }
}
