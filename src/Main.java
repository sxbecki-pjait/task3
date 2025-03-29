import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Event e1 = new Event("Ikony Motoryzacji", 80, "25th march 2025");
        Event e2 = new Event("Ultrace", 350, "30th june 2025", "Cracow");
        Customer c1 = new Customer("Pawel","Sobecki","s33693@pjwstk.edu.pl");
        Customer c2 = new Customer("John","Doe","jdoe@gmail.com");
        reservationSystem.addEvent(e1,e2);
        c1.addToReservationList(e1);
        c1.addToReservationList(e2);
        c2.addToReservationList(e1);
        c1.displayReservations();
        Event g = reservationSystem.findEvent("Ultrace");
        System.out.println(g.toString());
        reservationSystem.changeEventPrice("Ultrace", 1000);

    }

}