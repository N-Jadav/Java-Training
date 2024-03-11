import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		Map<String, Integer> students = new HashMap<>();
		students.put("N", 23);
		students.put("R", 12);
		students.put("Y", 43);
		students.put("T", 53);

		for(String key: students.keySet()){
			System.out.println(key+" : "+ students.get(key));
		}

  }
    
}
