public class employee extends data
{
    public void mailcheck()
    {
        System.out.println("Mailing to"+fname+" "+faddress);
    }
    public String tostring()
    {
        System.out.println(fname+" "+faddress+" "+fnumber);
        return fname+" "+faddress+" "+fnumber;
    }
    public String getname()
    {
        return fname;
        System.out.println(fname);
    }
    public String getaddress()
    {
        return faddress;
        System.out.println(faddress);
    }
    public void setaddress(String newaddress)
    {
        faddress=newaddress;
    }
    public int getnumber()
    {
        return fnumber;
        System.out.println(fnumber);
    }
    public static void main(String[] args)
    {
        data m = new employee();
        m.name="Vijay";
        m.address="Tamilnadu";
        m.number=10;
        m.employee(m.name,m.address,m.number);
        m.computepay();
        m.mailcheck();
        m.tostring();
        m.getname();
        m.getaddress();
        m.setaddress(address);
        m.getnumber();

    }
}