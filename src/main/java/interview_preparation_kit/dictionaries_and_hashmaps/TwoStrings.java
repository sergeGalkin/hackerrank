package interview_preparation_kit.dictionaries_and_hashmaps;


import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        boolean charFound;

        Set<Character> sc1 = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        Set<Character> sc2 = s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());


        charFound = sc1.stream()
                .anyMatch(sc2::contains);

        return charFound ? "YES" : "NO";
    }
}
