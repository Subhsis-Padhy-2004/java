public class default_constructor {
    int a; 
    String b; 
    boolean c;
    default_constructor()
    {
        a=100;
        b="subahsis";
        c=true;
    }
    void Disp()
    {
        System.out.print(a+" "+b+" "+c);
    }
}
class B
{
    public static void main(String[] args) {
        default_constructor r=new default_constructor();
        r.Disp();
    }
    
}
