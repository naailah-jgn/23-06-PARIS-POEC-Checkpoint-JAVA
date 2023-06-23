import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private List<Reservation> booking = new ArrayList<>();

    public Client(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getBooking() {
        return booking;
    }

    public void setBooking(List<Reservation> booking) {
        this.booking = booking;
    }

    public Reservation reserve(Seance seance, String place) {
        Reservation newResa = new Reservation(this,seance,place);
        booking.add(newResa);
        return newResa;
    }
}
