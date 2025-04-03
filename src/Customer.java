import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private List<Event> reservationList = new ArrayList<Event>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Event> getReservationList() {
        return reservationList;
    }
    public void addToReservationList(Event event) {
        reservationList.add(event);
        event.reserveSeat();
    }
    public void addToReservationList(Event event1, Event event2) {
        reservationList.add(event1);
        reservationList.add(event2);
        event1.reserveSeat();
        event2.reserveSeat();
    }
    public void cancelReservation(Event event) {
        reservationList.remove(event);
        event.cancelReservation();
    }

    public void displayReservations(){
        getReservationList().forEach(System.out::println);
    }

}
