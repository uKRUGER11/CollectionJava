package SetInterface.Basic;

import java.util.Objects;

public class Guests {
    private int inviteId;
    private String name;

    public Guests(int inviteId, String name) {
        this.inviteId = inviteId;
        this.name = name;
    }

    public int getInviteId() {
        return inviteId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "inviteId=" + inviteId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guests guests)) return false;
        return getInviteId() == guests.getInviteId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteId());
    }
}
