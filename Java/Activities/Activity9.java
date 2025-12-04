package Activity;

import java.util.ArrayList;

public class Activity9 {
public static void main(String args[])
{
	ArrayList<String> myList = new ArrayList<String>();
	myList.add("Orange");
	myList.add("Papaya");
	myList.add("Orange");
	myList.add(3,"grape");
	myList.add(4,"Apple");
    System.out.println("Print All the Objects:");
    for(String s:myList){
    	
        System.out.println(s);
	}
    System.out.println("3rd Element in the list is\n"+ myList.get(3));
    System.out.println("Is chicku is the first Element\n"+ myList.contains("chikku"));
    System.out.println("total elements of the array\n"+ myList.size());
    myList.remove("Papaya");
    System.out.print("new size of Arraylist\n"+myList.size());
}
    		
}


