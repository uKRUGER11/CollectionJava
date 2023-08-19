package SetInterface.Basic;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {
    private Set<Guests> guestsSet;

    public GuestsSet() {
        this.guestsSet = new HashSet<>();
    }

    public void addGuests(int inviteId, String name) {
        guestsSet.add(new Guests(inviteId, name));
    }

    public void removeByInviteId(int inviteId) {
        Guests guestsToRemove = null;

        for (Guests g : guestsSet) {
            if (g.getInviteId() == inviteId) {
                guestsToRemove = g;
                break;
            }
        }
        guestsSet.remove(guestsToRemove);
    }

    public int countGuests() {
        return guestsSet.size();
    }

    public void findAll() {
        System.out.println(guestsSet);
    }
}
