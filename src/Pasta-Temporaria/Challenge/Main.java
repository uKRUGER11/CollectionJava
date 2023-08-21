package SetInterface.Challenge;



public class Main {
    public static void main(String[] args) {
        SingleWordsSet singleWordsSet =  new SingleWordsSet();

        singleWordsSet.addWord("Abacaxi");
        singleWordsSet.addWord("Melão");
        singleWordsSet.addWord("Limão");
        singleWordsSet.addWord("Laranja");

        singleWordsSet.findAll();
        singleWordsSet.removeWord("Melão");
        singleWordsSet.checkWord("Denis");
        singleWordsSet.findAll();
    }
}
