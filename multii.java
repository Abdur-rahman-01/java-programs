class Grand{
    public void m1(){
        System.out.println("grand class method");
    }
}
class Parent extends Grand{
    public void m2(){
        System.out.println("class parent method");
    }
}
class Child extends Parent{
    public void m3(){
     System.out.println("child class method");
    }
}
public class multii{
public static void main (String args[]){
    Child obj= new Child();
    obj.m1();
    obj.m2();
}
}