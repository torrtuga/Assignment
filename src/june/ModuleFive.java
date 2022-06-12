package june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class ModuleFive {

	public static void main(String[] args) {

		// List/ArrayList example
		List<String> list = new ArrayList<String>();
		list.add("David");
		list.add("Jhon");
		list.add("Stacy");
		for (String Students : list)
			System.out.println(Students);

		//Queue example
		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("Banana");
		System.out.println(queue);
		queue.remove("Grapes");
		System.out.println(queue);

		//HashMap example
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Cricket");
		map.put(2, "Hockey");
		map.put(3, "Archery");
		for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}

		//Set example
		int count[] = { 21, 23, 43, 53, 22, 65 };
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i <= 5; i++) {
			set.add(count[i]);
		}
		System.out.println(set);

	}
}
