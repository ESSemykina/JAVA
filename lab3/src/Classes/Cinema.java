package Classes;

import java.util.ArrayList;
import java.util.List;
public class Cinema {
    private String name;
    private String adres;
    private String parking;
    private List<Session> sessions;

    public Cinema(String name,String adres,String parking) {
        this.name = name;
        this.adres = adres;
        this.parking = parking;
        sessions = new ArrayList<>();
    }

    public String getName ()
    {return name; }
    public void setName (String name)
    {this.name = name; }

    public String getAdres ()
    {return adres; }
    public void setAdres (String adres)
    {this.adres = adres; }

    public String getParking ()
    {return parking; }
    public void setParking (String parking)
    {this.parking = parking; }

    public List<Session> getSessions()
    {return sessions;}
    public void setSession (List<Session> sessions)
    {this.sessions = sessions;}

    public void addSession(Session session)
    {sessions.add(session);}

}
