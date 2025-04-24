abstract class Calculation{
    float a=12,b=6,c;
    abstract void add();//abstract method
    abstract void subtract();
// {
//     c=a-b;
//     System.out.println("result is "+c);

// }
abstract void multiply();
{
    //abstract method
c=a*b;
System.out.println("result is "+c);
}
void divide(){
    c=a/b;
    System.out.println("result is "+c);
}
}
public class abstractiondemo extends Calculation
{
    void add() {
   c=a+b;
System.out.println("result is "+c);

}
void multiply(){
    c=a*b;
    System.out.println("result is "+c);
}
public static void main(String[] args) {
    abstractiondemo obj=new abstractiondemo();
    obj.add();
    obj.subtract();
    obj.multiply();
    obj.divide();
}
}
