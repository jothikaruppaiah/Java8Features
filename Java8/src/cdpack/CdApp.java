package cdpack;

import java.util.Arrays;

public class CdApp {

	public static void main(String[] args) {
		
		Cd [] cdarray = new Cd[5];
		
		Cd c1 = new Cd("titanic","Leonard");
		Cd c2 = new Cd("kana","Siva Karthi");
		Cd c3 = new Cd("Madras","Karthi");
		Cd c4 = new Cd("Kanchana","lawrence");
		Cd c5 = new Cd("vadaChennai","Dhanush");
		
		cdarray[0] = c1;
		cdarray[1] = c2;
		cdarray[2] = c3;
		cdarray[3] = c4;
		cdarray[4] = c5;
		
		
		System.out.println("before sort");
		
		for(Cd x:cdarray)
		{
			System.out.println(x.getMovieName() + " "+x.getActorName());
		}
		
		Arrays.sort(cdarray);
		System.out.println("after sort");
		
		for(Cd x:cdarray)
		{
			System.out.println(x.getMovieName() + " "+x.getActorName());
		}
	}

}
