class stringss{
public static void main(String args[]){
String s1= new String("Hello"); //method 1
String s2=" Welcome"; //method 2
char ch[]={'t','o','t','h','e','w','o','r','l','d'};
String s3=new String(ch); //method 3
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.concat(s2));

System.out.println(s1);
System.out.println(s2);
System.out.println(ch);
 }
}
