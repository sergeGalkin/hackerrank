package interview_preparation_kit.string_manipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringsMakingAnagrams {
    public static void main(String[] args) {
        String s1 = "fcrxzwscanmligyxyvym";
        String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        StringsMakingAnagrams.makeAnagram(s1, s2);
    }

    static int makeAnagram(String a, String b) {
        List<Character> aL = a.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> bL = b.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        List<Character> differencesA = new ArrayList<>(aL);
        List<Character> differencesB = new ArrayList<>(bL);

        aL.forEach(differencesB::remove);
        bL.forEach(differencesA::remove);

        return differencesA.size() + differencesB.size();
    }
}
