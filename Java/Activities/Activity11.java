package Activity;

import java.util.HashMap;

public class Activity11 {
	public static void main(String args[])
	{
		HashMap<Integer, String> hs_map = new HashMap<Integer, String>();
		hs_map.put(1,"Red");
		hs_map.put(2,"Green");
		hs_map.put(3,"Blue");
		hs_map.put(4,"White");
		hs_map.put(5,"Black");
		System.out.println("Original map"+" " + hs_map);
		hs_map.remove(4,"White");
		System.out.println("After removing white"+ " " + hs_map);
		if(hs_map.containsValue("Green"))
		{
			System.out.println("Green colour present");
		}
		else
		{
			System.out.println("Green colour is not present in the map");
		}
		System.out.println("Number of colours in the map is"+" "+ hs_map.size());
	}

}
