import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of elements");
    int size=sc.nextInt();
    int[]arr=new int[size];
    System.out.println("enter"+"size"+"integers");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("the entered array is" );
    for(int i=0;i<size;i++)
    {
        System.out.println(arr[i]+" ");
    }
    }
}
