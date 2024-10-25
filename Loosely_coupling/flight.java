import java.util.*;

class flight{
    private  int id;
    private String name;
    private String src;
    private String desc;
    public flight(){

    }
    public flight(int id,String name,String src,String desc){
        super();
        this.id=id;
        this.name=name;
        this.src=src;
        this.desc=desc;
    }
    public String toString() {
    return "Flight ID: " + id + ", Name: " + name + ", Source: " + src + ", Destination: " + desc;
    }
}

interface Indigoservice{
    public List<flight> getflight();
}
class Indigoservice_imp1 implements Indigoservice{
        public List<flight> getflight(){
        List <flight> flights=new ArrayList<>();
        flights.add(new flight(100,"Indigo","Erode","Chennai"));
        flights.add(new flight(100,"Indigo","Chennai","Banglore"));
        flights.add(new flight(100,"Indigo","Coimbatore","Salem"));
        flights.add(new flight(100,"Indigo","Salem","Chennai"));
        return flights;
    }
}

class Indigoservice_imp2 implements Indigoservice{
        public List<flight> getflight(){
        List <flight> flights=new ArrayList<>();
        flights.add(new flight(100,"Indigo","Erode","Chennai"));
        flights.add(new flight(100,"Indigo","Chennai","Banglore"));
        return flights;
    }
}


class IndigoFactory{
    private IndigoFactory(){
        //to avoid instanation of this class form other class
    }
    public static Indigoservice getindigoservice(){
        return new Indigoservice_imp2();
    }
}

class Mntclient{
    public void display(){
        Indigoservice is = IndigoFactory.getindigoservice();
        List<flight> flights=is.getflight();
        for(flight i:flights)
        {
            System.out.println(i);
        }
    }
}

class Test{
    public static void main(String[] args) {
        Mntclient mn=new Mntclient();
        mn.display();
    }
}