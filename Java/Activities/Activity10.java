package Activity;

import java.util.HashSet;

public class Activity10 {
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("G");
		hs.add("k");
		hs.add("M");
		hs.add("N");
		System.out.println("print Original array set \n"+ hs);
		System.out.println("Size of an array\n"+ hs.size());
		System.out.println("remove element A from hashset \n"+ hs.remove("A"));
		if(hs.remove("Z"))
		{
			System.out.println("Z removed from Hashset");
		}
		else
		{
			System.out.println("Z is not present in hash set");
		}
		System.out.println("Checking if M is present\n" + hs.contains("M"));
		System.out.println("Updated hash set\n" + hs);
	}
	

}
