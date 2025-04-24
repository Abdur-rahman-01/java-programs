import java.io.*;
class fibonacci {
    public static void main(String args[]){
        int a=0;
        int b=1;//default class
        int sum;
        int temp;
        int i;
        int n=10;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=1;i<=n-2;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;

        }
    }
}