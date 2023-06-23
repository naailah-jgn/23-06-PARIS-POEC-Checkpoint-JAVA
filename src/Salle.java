import java.util.ArrayList;
import java.util.List;

public class Salle {
    private String salleName;
    private int capacity;
    private List<String> places = new ArrayList<>();

    public String getSalleName() {
        return salleName;
    }

    public void setSalleName(String salleName) {
        this.salleName = salleName;
    }

    public Salle(String salleName, int capacity, List<String> places) {
        this.salleName = salleName;
        this.capacity = capacity;
        this.places = places;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }
}
