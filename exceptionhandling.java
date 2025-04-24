public class exceptionhandling {
    public static void main(String[] args) {
        int num;
        try {
            num=10/0;
        } 
        catch (ArithmeticException e) {
            System.err.println("error handled");

        }


    }
}
