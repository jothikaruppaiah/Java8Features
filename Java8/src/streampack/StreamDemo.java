package streampack;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bangalore");
		names.add("Trichy");
		names.add("Erode");
		names.add("Mumbai");
		names.add("Chennai");
		
		for(String s: names)
		{
			System.out.println(s);
		}
		long cnt =  names.stream().filter(str->str.length()>5).count();
		System.out.println(cnt);
	}

}
