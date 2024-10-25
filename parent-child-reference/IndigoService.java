import java.util.*;

public class IndigoService{
    public List<flights> getFlights(){
        List<flights> flight=new ArrayList<>();
        flight.add(new flights(100,"Indigo","Erode","Chennai"));
        flight.add(new flights(100,"Indigo","Chennai","Banglore"));
        flight.add(new flights(100,"Indigo","Coimbatore","Salem"));
        flight.add(new flights(100,"Indigo","Salem","Chennai"));
        return flight;
    }
}
