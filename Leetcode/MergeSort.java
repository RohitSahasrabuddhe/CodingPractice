import java.util.*;

public class MergeSort{
	public static void main(String args[]) {
		int[] arr = {5,6,9,2,1,3,7,8};
		List<Integer> inp = new ArrayList<Integer>();
		for(int i : arr) {	
			inp.add(i);
		}
		List<Integer> op = mergeSort(inp);
		for(int i : op) {
			System.out.println(i);
		}
		
	}

	public static List<Integer> mergeSort(List<Integer> inp) {
		if(inp.size() == 1 ) {
			return inp;
		}
		int n = inp.size();
		
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			if(i < (int)n/2) {
				left.add(inp.get(i));
			} else {
				right.add(inp.get(i));
			}
		}
		left = mergeSort(left);
		right = mergeSort(right);			
	
		return merge(left, right);
	}
	
	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> op = new ArrayList<Integer>();
		int l = 0;
		int r = 0; 
		while(l < left.size() && r < right.size() ) {
			if(left.get(l) < right.get(r) ) {
				op.add(left.get(l));
				l++;
			} else {
				op.add(right.get(r));
				r++;
			}
		}
		while(l < left.size()) {
			op.add(left.get(l));
			l++;
		}
		while(r < right.size()) {
			op.add(right.get(r));
			r++;
		} 
		return op;
	}
}