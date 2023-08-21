package MapInterface.Assortment;

public class Event {
    private String name;
    private String show;

    public Event(String name, String show) {
        this.name = name;
        this.show = show;
    }

    public String getName() {
        return name;
    }

    public String getShow() {
        return show;
    }

    @Override
    public String toString() {
        return "(" + name + " - " + show + ")";
    }
}
