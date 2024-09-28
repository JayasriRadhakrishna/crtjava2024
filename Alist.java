import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class Alist
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
//ArrayList<Integer> al=n
Arrays.asList(a);

for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
