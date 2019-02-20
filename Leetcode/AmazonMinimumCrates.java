import java.util.*;

public class AmazonMinimumCrates {

	public static void main(String[] args) {
		List<Location> locations = createRandomLocations(10,10);
		for (int i = 0; i < locations.size(); i++) {
			System.out.println(locations.get(i));
			Location current = locations.get(i);
			current.setDistance(calculateDistance(current.x, current.y, 0, 0));
		}
		System.out.println("\n\n");
		Collections.sort(locations, new Comparator<Location>() {
			public int compare(Location l1, Location l2) {
				return l1.d - l2.d;
			}
		});
		
		int m = 5;
		for ( int i = 0; i < m; i++) {
			System.out.println(locations.get(i));
		}

	}
	
	private static int calculateDistance(int x, int y, int i, int j) {
		
		return (int)Math.sqrt((x-i)*(x-i) + (y-j)*(y-j));
	}

	public static List<Location> createRandomLocations(int size, int threshold) {
		List<Location> op = new ArrayList<Location>();
		for (int i = 0; i < size; i++) {
			int x = (int)(Math.random()*threshold);
			int y = (int)(Math.random()*threshold);
			Location l = new Location(x, y);
			//System.out.println(x + " , " + y);
			op.add(l);
		}
		return op;
	}

}
class Location{
	int x,y;
	int d;
	Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void setDistance(int d) {
		this.d = d;
	}
	
	@Override
	public String toString() {
		return x + "," + y + "\t";
	}
}
