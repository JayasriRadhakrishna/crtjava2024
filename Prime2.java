import java.util.*;
class Prime2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0,r=0;
if(n==1)
{
c=1;
}
for(int i=2;i<=Math.sqrt(n);i++)
{
r++;
if(n%i==0)
{
c++;
break;
}
}
System.out.println(r+" "+c);
if(c==0)
System.out.println("prime no");
else
System.out.println("not a prime no");
}
}

