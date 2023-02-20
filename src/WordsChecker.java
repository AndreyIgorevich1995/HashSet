import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    boolean hasWord(String word) {
        for (String s : text.split("\\P{IsAlphabetic}+")) {
            set.add(s);
        }
        if (set.contains(word)) {
            return true;
        } else return false;
    }
}
