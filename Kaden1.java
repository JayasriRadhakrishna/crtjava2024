import java.util.*;
class Kaden1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int cs=0,gs=a[0];
for(i=0;i<n;i++)
{
cs=cs+a[i];
if(gs<cs)
gs=cs;


if(cs<0)
cs=0;
}
System.out.println(gs);
}
}
