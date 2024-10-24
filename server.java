interface Servlet{
    void service();
}
class server{
    public static void main(String args[]) throws Exception
    {
        Object obj = Class.forName(args[0]).newInstance();
        //obj.service();
        Servlet servlet = (Servlet)obj;
        servlet.service();
    }
}

//developer 1
class Loginservlet implements Servlet{
    public void service()
    {
        System.out.println("This is Login Servlet");
    }
}

//developer 2
class Registration implements Servlet{
    public void service()
    {
        System.out.println("This is Regitration Servlet");
    }
}