import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected Set<String> set;
    //Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        } else return false;
    }
}
