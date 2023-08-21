package MapInterface.Basic;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    private Map<String, String> dictMap;

    public Dictionary() {
        this.dictMap = new TreeMap<>();
    }

    public void addWord(String word, String definition) {
        dictMap.put(word, definition);
    }

    public void removeWord(String word) {
        if (!dictMap.isEmpty()) {
            dictMap.remove(word);
        }
    }

    public String findByWord(String word) {
        String wordPerDefinition = null;
        if (!dictMap.isEmpty()) {
            wordPerDefinition = dictMap.get(word);
        }
        return wordPerDefinition;
    }

    public void findAll() {
        System.out.println(dictMap);
    }
}
