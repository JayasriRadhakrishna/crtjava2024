import java.util.*;
class Directions
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=0,y=0,u=10,i;
for(i=1;i<=n;i++)
{
switch(i%4)
{
case 1:x=x+u;
break;
case 2:y=y+u;
break;
case 3:x=x-u;
break;
case 0:y=y-u;
break;
}
u=u+10;
}
System.out.print(x+" "+y);
}
}



