package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String,Object> details = new HashMap<String,Object>();
		details.put("firstName", "sonu");
		details.put("lastName", "kumar");
		details.put("gender", "Male");
		details.put("weight", 70.39);
		details.put("age", 25);

		Set<String>req = details.keySet();

		for(String reqs:req) {
			System.out.println(details.get(reqs));
		}

	}

}
