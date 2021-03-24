package interview_preparation_kit.sorting;

public class BubbleSort {
    static void countSwaps(int[] a) {
        int _temp;
        int swaps = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    _temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = _temp;

                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
