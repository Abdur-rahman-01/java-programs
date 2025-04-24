class parent{
    public void m1(){
        System.out.println("class parent method");
    }
}
public class child extends parent{
    public void m2(){
        System.out.println("class child method");
    }
    public static void main(String[] args) {
        child obj= new child ();
        obj.m1();
        obj.m2();
    }
}