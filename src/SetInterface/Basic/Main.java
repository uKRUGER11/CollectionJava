package SetInterface.Basic;

public class Main {
    public static void main(String[] args) {
        GuestsSet guestsSet =  new GuestsSet();
        System.out.println("Existem " + guestsSet.countGuests() + " convidados dentro do conjunto.");

        guestsSet.addGuests(1254, "Denis");
        guestsSet.addGuests(1011, "Albert");
        guestsSet.addGuests(1011, "Rosa");
        guestsSet.addGuests(3210, "Bob");

        System.out.println("Existem " + guestsSet.countGuests() + " convidados dentro do conjunto.");

        guestsSet.removeByInviteId(1254);
        System.out.println("Existem " + guestsSet.countGuests() + " convidados dentro do conjunto.");
        guestsSet.findAll();
    }
}
