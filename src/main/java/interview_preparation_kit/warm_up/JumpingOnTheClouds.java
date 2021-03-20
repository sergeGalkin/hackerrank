package interview_preparation_kit.warm_up;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int doubleJump = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1) {
                if (doubleJump == 2) jumps++;
                jumps++;
                doubleJump = 0;
            } else {
                doubleJump++;
                if (doubleJump == 3) {
                    jumps++;
                    doubleJump = 1;
                } else if (i == c.length - 1 && doubleJump == 2) {
                    jumps++;
                }
            }
        }

        return jumps;
    }
}
