package interview_preparation_kit.warm_up;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println("Amount: '" + RepeatedString.repeatedString2("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L) + "'");
    }

    static long repeatedString(String s, long n) {
        long amount = 0;

        if (s.length() == 1 && s.charAt(0) == 'a') {
            return n;
        }

        char[] sChars = s.toCharArray();
        for(int i = 0, j = 0; i < n; i++, j++) {
            if (sChars[j] == 'a') {
                amount++;
            }

            if (j == sChars.length - 1) {
                j -= sChars.length;
            }

        }
        return amount;
    }

    static long repeatedString2(String s, long n) {
        long result = 0;

        long qRepeats = n / s.length();

        long rest = n - s.length() * qRepeats;

        char[] chars = s.toCharArray();

        for(char e : chars) {
            if (e == 'a') {
                result++;
            }
        }
        result *= qRepeats;
        for (int i = 0; i < rest; i++) {
            if (chars[i] == 'a') {
                result++;
            }
        }

        return result;
    }
}
