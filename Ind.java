import java.util.*;
class Ind
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(k!=a[i])
{
System.out.print(-1);
}
else
System.out.print(i);
}
}
}

