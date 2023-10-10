
// 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Random;
public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        int[] shuffledArray = originalArray.clone();

        customShuffleArray(shuffledArray);

        System.out.print("Original Array: ");
        printArray(originalArray);
        System.out.print("Shuffled Array: ");
        printArray(shuffledArray);
    }

    public static void customShuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}