import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringWithK1 {

	public static void main(String[] args) {
		String input = "democracy";
		int k = 5;
		
		List<String> op = getSubstrings(input, k);
		
		for (int i = 0; i < op.size(); i++) {
			System.out.println(op.get(i));
		}
	}

	private static List<String> getSubstrings(String input, int k) {
		List<String> op = new ArrayList<String>();
		
		for (int i = 0; i <= input.length()- k; i++) {
			if (checkSubstring(input.substring(i, i+k), k)) {
				op.add(input.substring(i, i+k));
			}
		}
		
		return op;
	}
	
	private static boolean checkSubstring(String s, int k) {
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size() == k-1) {
			return true;
		}
		return false;
	}

}