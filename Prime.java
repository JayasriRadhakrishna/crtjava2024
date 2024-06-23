import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0,r=0;
for(int i=1;i<=n;i++)
{
r++;
if(n%i==0)
c++;
}
System.out.println(r+" "+c);
if(c==2)
System.out.println("prime no");
else
System.out.println("not a prime no");
}
}

