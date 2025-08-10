import java.util.*;

public class AnagramDemo {
    public static void main(String[] args) {
        String word = "sanchit";
        Set<String> anagrams = new HashSet<>();
        generatePermutations("", word, anagrams);

        // Convert to list and sort
        List<String> sortedAnagrams = new ArrayList<>(anagrams);
        Collections.sort(sortedAnagrams);

        // Output
        System.out.println("Total distinct anagrams: " + sortedAnagrams.size());
        for (String anagram : sortedAnagrams) {
            System.out.println(anagram);
        }
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> results) {
        if (remaining.length() == 0) {
            results.add(prefix);
        }

        else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        results
                );
            }
        }
    }
}