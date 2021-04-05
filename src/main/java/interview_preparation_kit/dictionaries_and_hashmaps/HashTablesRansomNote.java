package interview_preparation_kit.dictionaries_and_hashmaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HashTablesRansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
//        String result = "yes";

//        List<String> magList = Arrays.stream(magazine).sorted().collect(Collectors.toList());
//
//        for (String phrase : note) {
//            if (list.contains(phrase)) {
//                result = "no";
//                break;
//            } else {
//                list.remove(phrase);
//            }
//        }

//        System.out.println(result);

        List<String> magazineWords = Arrays.stream(magazine)
                .sorted()
                .collect(Collectors.toList());
        boolean notRemovedWord = Arrays.stream(note)
                .anyMatch(word -> !magazineWords.remove(word));

        System.out.println(notRemovedWord ? "No" : "Yes");
    }
}
