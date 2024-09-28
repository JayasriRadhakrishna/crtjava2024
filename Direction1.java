import java.util.*;
class Directions1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=0,y=0,u=10,i;
char dir='R';
for(i=1;i<=n;i++)
{
if(dir=='R')
{
x=x+u;
u=u+10;
dir='U';
}
else if(dir=='U')
{
y=y+u;
u=u+10;
dir='L';
}
else if(dir=='L')
{
x=x-u;
u=u+10;
dir='D';
}
else if(dir=='D')
{
y=y-u;
u=u+10;
dir='A';
}
else if(dir=='A')
{
x=x+u;
u=u+10;
dir='R';
}
}
System.out.println(x+" "+y);
}
} 
