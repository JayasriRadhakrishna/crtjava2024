import java.util.ArrayList;
public class Aloop 
{
 public static void main(String[] args) 
 {
 ArrayList<String> list = new ArrayList<>();
 list.add("Apple");
 list.add("Banana");
 list.add("Cherry");
for (int i = 0; i < list.size(); i++) 
{
 System.out.println(list.get(i));
}
}
}