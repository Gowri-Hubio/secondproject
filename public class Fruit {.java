public class Fruit {
    String name;
    int f1,f2,f3;
    void show()
    {
        System.out.println("Name of the fruit:"+name);
    }
    
}
public class Main{
    public static void main(String[] args) {
       Fruit fr = new Fruit();
       fr.name="Apple";
       fr.f1=10;
       fr.f2=2;
       fr.f3=12;
       int total=fr.f1+fr.f2+fr.f3;
       fr.show();
       System.out.println("Total:"+total);
    }
}
