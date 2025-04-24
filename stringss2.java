
class stringss2{
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("hello world how are you");
        StringBuffer s2=new StringBuffer("what do you do");
        s1.append(" im fine ");
        System.out.println(s1);
       System.out.println(s1.compareTo(s2));
       System.out.println(s1.equals(s2));
       System.out.println(s1+  " " + s2);
       System.out.println(s1==s2);
       s1.insert(12,"java ");
       System.out.println(s1);
       s1.delete(0,11);
       System.out.println(s1);
       s1.reverse();
       System.out.println(s1);
       s1.length();
       System.out.println(s1);
    } 
     
}