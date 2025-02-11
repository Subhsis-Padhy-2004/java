public class Parametrized_Constructor {
    int x,y;
    Parametrized_Constructor(int a, int b)
    {
        x=a; y=b;
    }
    void Show()
    {
        System.out.print(x+" "+y);
    }
}
class b{
    public static void main(String[] args) {
        Parametrized_Constructor r=new Parametrized_Constructor(100, 200);
        r.Show();
    }
}
