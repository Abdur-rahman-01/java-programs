import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        
    
    int arr[]={1,5,7,3,4,2,1};
    int frequency=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the key to search:");
    int key=sc.nextInt();
    try {
    
    for(int i:arr){
        if(i==key){
            frequency+=1;
        }


    }
    System.out.println("frequency is "+frequency);
}
    finally{
        System.out.println("thank you");
    }
}
}