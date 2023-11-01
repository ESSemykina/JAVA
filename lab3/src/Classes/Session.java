package Classes;

public class Session {
    private int number;
    private String start;
    private String film;
    private String duration;//продолжительность

    public Session(int number,String start, String film, String duration) {
        this.number = number;
        this.start = start;
        this.film = film;
        this.duration = duration;
    }
    public int getNumber()
    {return number;}

    public void setNumber(int number)
    {this.number = number;}

    public String getStart ()
    {return start;}
    public void setStart (String start)
    {this.start = start;}

    public String getFilm ()
    {return film;}
    public void setFilm (String Film)
    {this.film = film;}

    public String getDuration ()
    {return duration;}
    public void setDuration (String duration)
    {this.duration = duration;}

}
