class inheritancee {
    int result;
    public void square(int a){
        result =a*a;
        System.out.println("the square of "+a+" is: "+ result);
}
}
public class Subdemo extends inheritancee{
    public void cube(int a){
        result=a*a*a;
     System.out.println("the cube of "+a+" is: "+ result);
    }

public static void main(String[] args) {
    int a=25;
    Subdemo sub=new Subdemo();
    sub.square(a);
    sub.cube(a);
}
}

