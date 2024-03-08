package mainmethod;

import java.util.ArrayList;
import java.util.List;

import plannermodel.Event;
import plannermodel.Person;
import plannermodel.DayOfWeek;

/**
 * The {@code NUPlannerUtil} class provides utility methods for working with
 * events in the NUPlanner application. It includes a method to retrieve
 * a list of events for a specific user and day of the week.
 */
public class NUPlannerUtil {

  /**
   * The list of events managed by the utility class.
   */
  private static List<Event> events = new ArrayList<>();

  /**
   * Retrieves a list of events for a specific user and day of the week.
   * The result includes all events hosted by the given user on the specified day.
   *
   * @param user the user for whom events are retrieved
   * @param day the day of the week for which events are retrieved
   * @return a list of events hosted by the specified user on the given day
   */
  public static List<Event> getEventsForUserAndDay(Person user, DayOfWeek day) {
    List<Event> resultEvents = new ArrayList<>();
    for (Event event : events) {
      if (event.getNameOfHost().equals(user) && event.eventStartingDay().equals(day)) {
        resultEvents.add(event);
      }
    }
    return resultEvents;
  }

  /**
   * The main method serves as an example usage of the utility methods.
   * It demonstrates how to create a user, specify a day of the week,
   * and retrieve a list of events for that user on the specified day.
   *
   * @param args the command-line arguments (not used in this example)
   */
  public static void main(String[] args) {
    // Example usage
    Person user = new Person("John", "Doe");
    DayOfWeek day = DayOfWeek.MONDAY;
    List<Event> userEventsOnDay = getEventsForUserAndDay(user, day);
  }
}

