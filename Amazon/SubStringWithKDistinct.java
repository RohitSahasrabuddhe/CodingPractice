import java.util.*;

public class SubstringsWithKDistinct {

	public static void main(String[] args) {
		String input = "sahasrabuddhe";
		int k = 4;
		
		List<String> op = getSubstrings(input, k);
		
		for (int i = 0; i < op.size(); i++) {
			System.out.println(op.get(i));
		}
	}
	
	private static List<String> getSubstringsBrute(String input, int k) {
		List<String> op = new ArrayList<String>();
		
		for(int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				int  distinct = getDistinctCount(input.substring(i, j));
				if(distinct == k) {
					op.add(input.substring(i, j));
				}
			}
		}
		
		
		return op;
	}
	private static int getDistinctCount(String s) {
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		return set.size();
	}

	private static List<String> getSubstrings(String input, int k) {
		List<String> op = new ArrayList<String>();
		
		int left = 0;
		int right = 0;
		int distinct = 0;
		Map<Character, Integer> map =new HashMap<Character, Integer>();
		
		while ( left <= right && right < input.length() ) {
			if (map.size() == k) {
				System.out.println(input.substring(left, right));
				op.add(input.substring(left, right));
				right++;
			}
			else if (map.size() < k) {
				if (map.containsKey(input.charAt(right))) {
					map.put(input.charAt(right), map.get(input.charAt(right)) + 1);
					right++;
				}
				else {
					map.put(input.charAt(right),1);
					right++;
				}
			}
			else {
				if (map.get(input.charAt(left)) == 1) {
					map.remove(input.charAt(left));
				}
				else {
					map.put(input.charAt(left), map.get(input.charAt(left)) - 1);
				}
				left++;
			}
		}
		
		
		return op;
	}

}
