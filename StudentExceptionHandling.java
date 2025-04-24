import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentExceptionHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=" ";
        int[]marks=new int[3];
        int totalsum=0;
        try {
            System.out.println("enter student name:");
            name=sc.nextLine();
            System.out.println("enter marks for 3 subjects(0-100)");
            for(int i=0;i<3;i++){
                System.out.print("subject"+(i+1)+ ":");
                marks[i]=sc.nextInt();
                totalsum +=marks[i];
                if(marks[i]<0 || marks[i]>100){
                    throw new IllegalArgumentException("marks should be between 0 and 100");
                }
            }
            System.out.println("total sum is:"+totalsum);
        }
             
            catch(InputMismatchException e) {
                System.out.println("input error:please enter numeric values instead of marks");
            }
                
            catch(IllegalArgumentException e){
                System.out.println("Validation error:"+ e.getMessage());
            }
            catch(Exception e){
                System.out.println("unexpected error:"+e.getMessage());
            }
            finally{
                System.out.println("always executes, execution complete!");
                sc.close();
            }
        }
    }

