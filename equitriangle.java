class equitriangle{
public static void main(String args[]){
int i,j,n=4,k;
for(i=1;i<=4;i++)
{
k=n;
for(j=1;j<=i;j++)
{
while(k>0)
{
System.out.print(" ");
k--;
}
System.out.print(j + " ");
}
n--;
System.out.println();
}
}
}
