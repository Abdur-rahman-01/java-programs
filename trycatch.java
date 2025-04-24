public class trycatch {
    public static void main(String[] args) {
        
    
//     int a[]=new int[5];
//     try {
//             a[5]=30/0;
//     }
// catch(ArithmeticException e){
//     System.out.println("eror handled");
// }

// try {
//     int data=50/0;
// } catch (Exception e) {
//     System.err.println(e);
// }
// System.err.println("rest of the code");

int a[]=new int[5];
int b=30;
try {
    a[5]=30/0;
    b=b/0;
} 
catch (ArithmeticException e) {
    System.out.println("task 1 completed");
}
catch(ArrayIndexOutOfBoundsException e){
 System.out.println("task 2 completed");
}
 catch(Exception e){
    System.out.println("common task completed");

 }
 finally{
    System.out.println("this always execute");
 }
 System.out.println("rest of the code");// only 1  error is handled
}
}


