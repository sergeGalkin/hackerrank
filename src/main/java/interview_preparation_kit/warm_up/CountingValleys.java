package interview_preparation_kit.warm_up;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int attitude = 0;

        for(char e : path.toCharArray()) {
            switch(e) {
                case 'U':
                    attitude++;
                    if (attitude == 0) valleys++;
                    break;
                case 'D':
                    attitude--;
                    break;
            }
        }

        return valleys;
    }
}
