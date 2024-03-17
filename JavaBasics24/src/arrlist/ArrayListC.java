package arrlist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList al = new ArrayList();
		
		al.add(1589);
		al.add(1, 87);
		al.add(2, 115);
		System.err.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		for(Object obj: al) {
			
			System.out.println(obj);
		}
	}

}
