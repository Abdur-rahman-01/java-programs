//create using the thread class
class ThreadA implements  Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("thread a executes.." + -1*i);
        }
        System.out.println("thread a terminates");
    }
}
class ThreadB implements Runnable{
    public void run(){
        for(int j=0;j<=10;j++){
            System.out.println("thread b executes..." +2*j);

        }
        System.out.println("thread b terminates");
    }
}
class ThreadC implements Runnable{
    public void run(){
        for(int k=0;k<=10;k++){
            System.out.println("thread c executes..."+ 2*(k+1));
        }
        System.out.println("thread c terminates");
    }
}
public class multithreading {
  public static void main(String[] args) {
      ThreadA a =new ThreadA();
      Thread t1=new Thread(a);
      ThreadB b =new ThreadB();
      Thread t2 = new Thread(b);
      ThreadC c =new ThreadC();
      Thread t3=new Thread(new ThreadC());
      t1.start();
      t2.start();
      t3.start();
       
    //    b.start();
    //   c.start();
      System.err.println("multithreading ends");

  }  
}
