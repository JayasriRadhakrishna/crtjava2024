package pack2;
import pack1.First1;
class Fifth 
{
void show5()
{
First1 f=new First1();
//System.out.println("a="+f.a);
//System.out.println("b="+f.b);
//System.out.println("c="+f.c);
System.out.println("d="+f.d);
}
public static void main(String args[])
{
Fifth f2=new Fifth();
f2.show5();
}
}
/*C:\java pgm>javac -d . Fifth.java
Fifth.java:10: error: c has protected access in First1
System.out.println("c="+f.c);
                         ^
1 error

C:\java pgm>javac -d . Fifth.java

C:\java pgm>java pack2.Fifth
d=400 */