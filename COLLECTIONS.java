package operators;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class COLLECTIONS {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("Hi", "Sreeram"));
		
		names.add("Omkar");
		
		System.out.println(names);
	}

}
