package rep;


import java.util.*;

public class Notepad {

    private ArrayList<Event> eventsList = new ArrayList<Event>();
    private String dateStart = "";
    private String dateEnd = "";


    public Notepad() {

    }

    public Notepad(String dateStart, String dateEnd) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Notepad(String dateStart, String dateEnd, Event ev) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;

        this.eventsList.add(ev);
    }

    private static class Event {
        private String eventName = "";
        private String eventDescription = "";
        private String eventPlace = "";

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public void setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
        }

        public void setEventPlace(String eventPlace) {
            this.eventPlace = eventPlace;
        }

        public String getEventDescription() {
            return eventDescription;
        }

        public String getEventPlace() {
            return eventPlace;
        }

        public String getEventName() {
            return eventName;
        }
    }

    public void setEvent(String eventName, String eventDescription, String eventPlace) {
        Event ev = new Event();
        ev.setEventName(eventName);
        ev.setEventDescription(eventDescription);
        ev.setEventPlace(eventPlace);

        eventsList.add(ev);
    }

    public void removeEvent(int index) {

        if (eventsList.size() <= index) return;
        eventsList.remove(index);
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void printEvent() {
        StringBuilder printInfo = new StringBuilder();

        printInfo.append("Начало события " + getDateStart() + ": \n");
        printInfo.append("Окончание события " + getDateEnd() + ": \n");
        for (Event ev : this.eventsList) {
            printInfo.append("Имя: " + ev.getEventName() + "\n")
                     .append("Описание: " + ev.getEventDescription() + "\n")
                     .append("Место:" + ev.getEventPlace() + "\n");
        }

        System.out.println(printInfo + "\n");
    }

    @Override
    public String toString() {
        StringBuilder printInfo = new StringBuilder();

        printInfo.append("Начало события " + getDateStart() + ": \n");
        printInfo.append("Окончание события " + getDateStart() + ": \n");
        for (Event ev : this.eventsList) {
            printInfo.append("Имя: " + ev.getEventName() + "\n")
                     .append("Описание: " + ev.getEventDescription() + "\n")
                     .append("Место:" + ev.getEventPlace() + "\n");
        }

        return printInfo.toString();
    }

}