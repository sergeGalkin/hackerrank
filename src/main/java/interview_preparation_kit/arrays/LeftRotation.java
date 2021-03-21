package interview_preparation_kit.arrays;

import java.util.Arrays;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] temp = new int[a.length];

        int q = d/a.length;
        int w = d - q;

        if (q > 0) {
            d = w;
        }

        // copy first d element in array temp
        if (d >= 0) System.arraycopy(a, 0, temp, 0, d);

        // move the rest element to index
        // zero to N-d
        if (a.length - d >= 0) System.arraycopy(a, d, a, 0, a.length - d);

        // copy the temp array element
        // in origninal array
        if (d >= 0) System.arraycopy(temp, 0, a, a.length - d, d);

        return a;
    }
}
