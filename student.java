class student
{
public static void main(String args[])
{
student s1=new student();
student s2=new student();
s1.study();
s1.feepayed(15000);
s2.feepayed(25000);
}
void study()
{
System.out.println("student studies JAVA");
}
void feepayed(int due)
{
if(due>20000)
{System.out.println(" fee is not due");
}
else
{System.out.println("fee is not due");
}
}
}

