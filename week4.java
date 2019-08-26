import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Timmothy");
		employeeNames.add("Bill");
		employeeNames.add("Sandra");
		employeeNames.add("Robert");
		employeeNames.add("Lisa");
		
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(101);
		ids.add(201);
		ids.add(301);
		ids.add(401);
		ids.add(501);
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		//Map.put
		int i = 0;
		for(Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		for (Integer employeeId : employeeMap.keySet()){
			System.out.println(employeeId + " " + employeeMap.get(employeeId));
			}
		StringBuilder idsBuilder = new StringBuilder();
		idsBuilder.append(ids);
		System.out.println(idsBuilder.toString());
		StringBuilder namesBuilder = new StringBuilder();
		namesBuilder.append(employeeNames);
		System.out.println(namesBuilder.toString());
		}

	}

	
	


