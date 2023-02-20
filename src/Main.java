public class Main {
    public static void main(String[] args) {
        WordsChecker wordsChecker=new WordsChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        System.out.println(wordsChecker.hasWord("dolor"));
        System.out.println(wordsChecker.hasWord("ol"));
        System.out.println(wordsChecker.set);
    }
}