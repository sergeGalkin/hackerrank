package interview_preparation_kit.arrays;

public class HourglassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int result = Integer.MIN_VALUE;

        for(int j = 0; j < 4; j++) {
            for(int i = 0; i < 4; i++) {
                int sg = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2] + arr[i + 2][j + 2];

                result = Math.max(sg, result);
            }
        }
        return result;
    }
}
