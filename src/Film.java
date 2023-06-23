import java.util.Date;

public class Film {
    private String name;
    private String synopsis;
    private Date release_date;

    public Film(String name, String synopsis, Date release_date )
    { this.name = name; this.synopsis = synopsis; this.release_date = release_date; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
}
