package com.cts.codllections;
import java.util.*;
import java.util.ArrayList;

public class MyApp {
public static void main(String[] args) {
	List<String> list =new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	System.out.println(list);

	Iterator i = list.iterator();
	Object object[] =list.toArray();
	String string[]=list.toArray(new String[1]);

	//System.out.println(object);

	System.out.println(Arrays.toString(string));
	list.set(2, "F");
	string[3]="G";
	System.out.println("LIST :"+list);
	System.out.println("Arrays :"+Arrays.toString(string));






/*	System.out.println(list);
	Iterator <String> iterator=list.iterator();
while(iterator.hasNext()) {
	String string =iterator.next();
	System.out.println(string);
	if(string.equals("C"))
		iterator.remove();

}
System.out.println(list);
for(String s:list) {
	System.out.println(s);
}
	*/

}
}
