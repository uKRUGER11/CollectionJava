package MapInterface.Search;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        dict.addWord("Pelé", "Que ou aquele que é fora do comum, que ou quem em virtude de sua qualidade, " +
                "valor ou superioridade não pode ser igualado a nada ou a ninguém, assim como Pelé");
        dict.addWord("Ajudante", "Aquele que ajuda a algúem ou algo.");
        dict.addWord("Violino", "Instrumento musical.");
        dict.addWord("Zebra", "Animal com listras pretas e brancas.");

        dict.findAll();
        dict.removeWord("Violino");
        dict.findAll();

        System.out.println("A definição dessa palavra é: " + dict.findByWord("Zebra"));
    }
}
