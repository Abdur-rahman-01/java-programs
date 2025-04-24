public class Overloading {
        void test(){
        System.out.println("no parameters");
        }
       void test(int a){
          System.out.println("a:"+a);
        }
        void test(int a, int b){
            System.out.println("a and b" + " " + a + b);
        }
public static void main(String[] args) {
    Overloading obj= new Overloading();
    obj.test(20);
    obj.test(10,20);
    obj.test();

}
}

