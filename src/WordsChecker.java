import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected static String text = "Lorem ipsum dolor sit amet," +
            " consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum.";
    protected static Set<String> set = new HashSet<>();

    public WordsChecker(String text, Set<String> set) {
        this.text = text;
        this.set = set;
    }

    public WordsChecker() {
        this(text, set);
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
