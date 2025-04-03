import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Event e1 = new Event("Ikony Motoryzacji", 80, "25th march 2025");
        Event e2 = new Event("Ultrace", 350, "30th june 2025", "Cracow");
        Event e3 = new Event("Drift Masters", 100, "20th june 2025", "Warsaw");
        Customer c1 = new Customer("Pawel","Sobecki","s33693@pjwstk.edu.pl");
        Customer c2 = new Customer("John","Doe","jdoe@gmail.com");
        Customer c3 = new Customer("Dom","Nom","dnom@gmail.com");

        reservationSystem.addEvent(e1,e2);
        reservationSystem.addEvent(e3);

        reservationSystem.addCustomer(c3);
        reservationSystem.addCustomer(c1,c2);

        c1.addToReservationList(e1);
        c1.addToReservationList(e2,e3);
        c2.addToReservationList(e1,e2);
        c1.displayReservations();
        Event g = reservationSystem.findEvent("Ultrace");
        reservationSystem.changeEventPrice("Ultrace", 1000);
        reservationSystem.displayEvents();

    }

}