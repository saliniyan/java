public class flights{
    private  int id;
    private String name;
    private String src;
    private String desc;
    public flights(){

    }
    public flights(int id,String name,String src,String desc){
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
