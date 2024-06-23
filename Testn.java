import java.util.*;
class Testn
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int tot=0;
for(int i=0;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
tot=tot+i;
}
}
System.out.println(tot);
}
}

