package MapInterface.Assortment;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;

public class CalendarEvent {
    private Map<LocalDate, Event> eventMap;

    public CalendarEvent() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String show) {
        eventMap.put(date, new Event(name, show));
    }

    public void findAllCalendar() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        System.out.println(eventMap);
    }

    public void nextEvent() {
        //Set<LocalDate> dateSet = eventMap.keySet();
        //Collection<Event> values = eventMap.values();
        //eventMap.get();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        for (Map.Entry<LocalDate, Event> entry : eventTreeMap.entrySet()) {
            if(entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("o próximo evento " + entry.getValue() + " acontecerá no dia " + entry.getKey());
                break;
            }
        }
    }
}

class Application {
    public static void main(String[] args) {
        CalendarEvent calendarEvent = new CalendarEvent();

        calendarEvent.addEvent(LocalDate.of(2023, Month.AUGUST, 21), "Evento 1", "Festa Junina");
        calendarEvent.addEvent(LocalDate.of(2024, Month.FEBRUARY, 27), "Evento 2", "Carnaval");
        calendarEvent.addEvent(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Ano Novo");

        calendarEvent.findAllCalendar();
        calendarEvent.nextEvent();
    }
}
