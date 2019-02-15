package algo.assign.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MaximumSubarray {

	public static String filePath = "C:\\Users\\rsahasra\\Softwares\\CTCI\\src\\input.txt";
	public static ArrayList<ArrayList<Integer>> inputLists;
	public static int[] expectedOutputs, generatedOutputs;
	
	public static void main(String[] args) {
		
		inputLists = populateListOfInputs();
		expectedOutputs = new int[inputLists.size()];
		generatedOutputs = new int[inputLists.size()];
		
		//printListOfList(inputLists);
		
		for(int i = 0; i < inputLists.size(); i++) {
			//Each input instance
			ArrayList<Integer> currentList = inputLists.get(i);
			int[] array = new int[currentList.size()-1];
			for(int j = 0; j < currentList.size()-1; j++) {
				array[j] = currentList.get(j);
			}
			expectedOutputs[i] = currentList.get(currentList.size()-1);
			
			// Calling The maximumSubarray method
			generatedOutputs[i] = maximumSubarray(array);
			
			if(generatedOutputs[i] == expectedOutputs[i]) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		
		
		
		// Asymptotic Analysis starts here
		
		asymptoticAnalysis();

	}
	
	
	private static void asymptoticAnalysis() {
		for(int i = 1; i <= 10; i++) {
			int[] array = getMeRandomArray(100*i);
			
			System.out.println(maximumSubarray(array));
			
		}
		
	}


	private static int[] getMeRandomArray(int length) {
		int array[] = new int[length];
		int min = -1000;
		int max = 1000;
		for(int i = 0; i < length; i++) {
			array[i] = (int)(Math.random() * ((max - min) + 1)) + min;
			System.out.println(array[i]);
		}
		return array;
	}


	// Rupal changes start here
	private static int maximumSubarray(int[] array) {
		
		
		
		return 0;
	}



	private static void printListOfList(ArrayList<ArrayList<Integer>> inputList) {
		Iterator< ArrayList<Integer>> itor = inputList.iterator();
		while(itor.hasNext()) {
			ArrayList<Integer> current = itor.next();
			Iterator<Integer> eleItor = current.iterator();
			while(eleItor.hasNext()) {
				int currentElement = eleItor.next();
				System.out.print(currentElement + " ");
			}
			System.out.println("");
		}
		
	}
	

	private static ArrayList<ArrayList<Integer>> populateListOfInputs() {
		
		ArrayList<ArrayList<Integer>> listOflist = new ArrayList<ArrayList<Integer>>();
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);		
			
			String line;
			while ((line = br.readLine()) != null) {
				String numbers = line.replace(" ", "");
				numbers = numbers.replace("[", "");
				numbers = numbers.replace("]", "");
				
				if(line.equals("")) {
					//if empty line leave it and continue the loop
					continue;
				}
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				String[] individualnums = numbers.split(",");
				for (int i = 0; i < individualnums.length; i++) {					
					list.add(Integer.parseInt(individualnums[i]));
					
				}
				listOflist.add(list);				
			}		
			
			br.close();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listOflist;
	}
	
	

}
