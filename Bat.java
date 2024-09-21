import java.util.*;
class Node
{
int tree[];
int size,pos;
Node(int n)
{
tree =new int[n];
Arrays fiil(tree,-1);
size=n;
pos=1;
}
void insert(int x)
{
if(pos>=size)
{
System.out.println("tree is full");
return;
}
pos++;
tree[pos]=x;
{



