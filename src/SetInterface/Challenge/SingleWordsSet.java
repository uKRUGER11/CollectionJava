package SetInterface.Challenge;

import SetInterface.Basic.Guests;

import java.util.HashSet;
import java.util.Set;

public class SingleWordsSet {
    private Set<String> singleWordsSet;

    public SingleWordsSet() {
        this.singleWordsSet = new HashSet<>();
    }

    public void addWord(String word) {
        singleWordsSet.add(word);
    }

    public void removeWord(String word) {
        String wordsToRemove = "";

        for (String s : singleWordsSet) {
            if (s.equalsIgnoreCase(word)) {
                wordsToRemove = s;
                break;
            }
        }
        singleWordsSet.remove(wordsToRemove);
    }

    public void checkWord(String word) {
        for (String s : singleWordsSet) {
            if (s.equalsIgnoreCase(word)) {
                System.out.println("A palavra " + word + " pertence ao conjunto");
                break;
            } else {
                System.out.println("A palavra " + word + " não pertence ao conjunto");
                break;
            }
        }
    }

    public void findAll() {
        System.out.println(singleWordsSet);
    }
}
