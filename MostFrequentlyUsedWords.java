import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MostFrequentlyUsedWords {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("an");
		list.add("the");
		
		String text = "You should know at a a a an the least one one programming language really well, preferably C++";
		
		List<String> output = mostFrequentlyUsedWords(text,list);
		
		for(int i = 0 ; i < output.size(); i++) {
			System.out.println(output.get(i) + " " + i);
		}
		
	}

	private static List<String> mostFrequentlyUsedWords(String text, List<String> list) {
		List<String> output = new ArrayList<String>();
		text = text.replaceAll("[^A-Za-z0-9]", " ");
		text = text.toLowerCase();
		
		Set<String> stop = new HashSet<String>();
		for ( int i = 0; i < list.size(); i++) {
			// current stop word
			String current = list.get(i).toLowerCase();
			if (stop.add(current));
		}		
		String parts[] = text.split(" ");
		Map<String,Integer> map = new HashMap<String, Integer>();
		int max = 0;
		for (int i = 0; i < parts.length; i++) {
			if (!stop.contains(parts[i])) {
				if (map.containsKey(parts[i])) {
					map.put(parts[i], map.get(parts[i]) + 1);
				}
				else {
					map.put(parts[i], 1);
				}
				max = Math.max(max, map.get(parts[i]));
			}			
		}		
		Iterator itor = map.entrySet().iterator();
		while (itor.hasNext()) {
			Map.Entry pair = (Map.Entry)itor.next();
			int current = (int) pair.getValue();
			if(max == current) {
				output.add((String)pair.getKey());
			}
		}
		return output;
	}

}
