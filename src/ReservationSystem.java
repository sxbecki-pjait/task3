import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Event> events = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

// to be finished
    public void addEvent(Event event){
        events.add(event);
    }
    public void addEvent(Event e1, Event e2){
        events.add(e1);
        events.add(e2);
    }
    public void addEvent(Event e1, Event e2, Event e3){
        events.add(e1);
        events.add(e2);
        events.add(e3);
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }
    public void addCustomer(Customer c1, Customer c2){
        customers.add(c1);
        customers.add(c2);
    }
    public void addCustomer(Customer c1, Customer c2, Customer c3){
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
    }

    public void makeReservation(Customer customer, Event event){
        if(event.getAvailableSeats() <= 0){
            throw new IllegalArgumentException("No available seats");
        }
        customer.addToReservationList(event);
        event.reserveSeat();
    }

    public Event findEvent(String name){
        for(Event e : events){
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
    public Customer findCustomer(String lastName){
        for(Customer c : customers){
            if(c.getLastName().equals(lastName)){
                return c;
            }
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice){
        findEvent(name).setPrice(newPrice);
    }

    public void displayEvents(){
        System.out.println("=============================");
        System.out.println("Events in reservation system:");
        System.out.println();
        for(Event e : events){
            System.out.println(e);

        }
        System.out.println("=============================");
    }

}
