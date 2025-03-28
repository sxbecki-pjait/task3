public class Main {
    public static void main(String[] args) {
        Event e1 = new Event("Ikony Motoryzacji", 80, "25th march 2025", "Warsaw");
        Event e2 = new Event("Ultrace", 350, "30th june 2025", "Cracow");
        Customer c1 = new Customer("Pawel","Sobecki","s33693@pjwstk.edu.pl");
        c1.addToReservationList(e1);
        c1.addToReservationList(e2);
        c1.displayReservations();
        c1.cancelReservation(e1);
        c1.displayReservations();

    }

}