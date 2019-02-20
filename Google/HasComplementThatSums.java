import java.util.Set;
import java.util.HashSet;

public class HasComplementThatSums {
	public static void main (String argd[]) {
		int[] array = {1, 3, 9, 8, 6, 5};
		int sum = 90;
		System.out.println(hasComplementThatSums(array,sum));
	}

	public static boolean hasComplementThatSums (int[] array, int sum) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (s.contains(sum - array[i])) {
				return true;
			}
			s.add(array[i]);
		}
		return false;
	}

}