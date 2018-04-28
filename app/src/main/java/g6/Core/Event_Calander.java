package g6.Core;

import java.util.ArrayList;
import java.sql.Date;

/**
 * Created by Brandon Keen on 4/28/2018.
 */

public class Event_Calander {

    ArrayList<Event> events  = new ArrayList<Event>();

    public Event_Calander() {
    }

    public Event_Calander(ArrayList<Event> events) {
        this.events = events;
    }

    public void addEvent(Event e)
    {
        events.add(e);
    }

    public ArrayList<Event> getEventsOfDay(Date date)
    {
        ArrayList<Event> daysEvents = new ArrayList<Event>();

        for(Event e : events)
        {
            if(date.getDay() == e.getDate().getDay() && date.getMonth() == e.getDate().getMonth())
            {
                daysEvents.add(e);
            }
        }
        return daysEvents;
    }


}
