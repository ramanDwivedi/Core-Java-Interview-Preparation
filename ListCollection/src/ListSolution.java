import java.util.ArrayList;
import java.util.Vector;

public class ListSolution {
public static void main(String[] args) {
ArrayList al=new ArrayList();	
System.out.println("Initial size of ArrayList:"+al.size());
//adding elements to the arraylist
al.add("Red");
al.add("Green");
al.add("Blue");
al.add("Pink");
al.add("orange");
System.out.println("\n Size of ArrayList after Addition: "+al.size());
System.out.println("\n Contents of ArrayList After add: "+al);
//Removing 4th index elements from ArrayList
al.remove(4);
System.out.println("\n Contents of ArrayList after remove index: "+al);
//Removing "pink" elements from ArrayList
al.remove("Pink");
System.out.print("\n Content of ArrayList after remove object: "+al);
System.out.println("\n Size of ArrayList after deletions: "+al.size());
//retrieving 1st index elements
String alElement =(String)(al.get(1));
System.out.println("alElements:"+alElement);
//inserting 2nd index
al.add(2,alElement+"rose");
System.out.println(al);
Vector v=new Vector();
for(int i=0;i<9;i++)
{
v.add(new Integer(i*10));
}
System.out.println("Initial elements:"+v);
v.removeElementAt(0);
v.removeElementAt(1);
System.out.println("elements after removing:"+v);












	}

}
