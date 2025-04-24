public class CallByValue {
    class test{
        int temp;
        void meth(int a, int b){
        System.out.println("hello");

    }

public static void main(String args[])
{
    Test obj=new Test();
    int a=15,b=20;
    System.out.println("a and b before call");
    System.out.println(a + " " +b);
    obj.meth(a,b);
    System.out.println("a and b after call"); 
    System.out.println(a + " " +b);
}
    }
}
