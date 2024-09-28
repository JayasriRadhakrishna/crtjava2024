import java.util.*;
class High
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String res[]=str.split(" ");
for(int i=0;i<res.length;i++)
{
System.out.println(res[i]+" "+res[i].length());
String str1=s.nextLine(res[i]);
if(str1>res[i])
{
System.out.print(res[i]);
}
}
}
}
