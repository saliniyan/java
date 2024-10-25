import java.util.*;

public class Mntclient{
    public void display(){
        IndigoService is=new IndigoService();
        List<flights> flight =is.getFlights();
        for(flights i:flight)
        {
            System.out.println(i);
        }
    }
}