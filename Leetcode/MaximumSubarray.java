package algo.assign.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MaxSubArray {

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
			// you can call it one more time to get output from DevideAnd Conqure Method 
			// and compare that too in similar fashion
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
	
	/*
	 * Maximum Sub Array function. Brute force approach
	 */
	private static int maximumSubarray(int[] array) {
		int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            int sum = 0;
            for (int j = i; j < array.length; j++)
            {
                sum += array[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max; 
	}
	
	
	/*
	 * Asymptotic Analysis function
	 */
	private static void asymptoticAnalysis() {
		for(int i = 1; i <= 10; i++) {
			int[] array = getMeRandomArray(100*i);
			// Start timer here
			System.out.println(maximumSubarray(array));
			// End timer here
			// Print time here
		}
		
	}


	/*
	 * Random Array generator
	 * Input: Length of array
	 * Output: Random array of given length
	 */	
	private static int[] getMeRandomArray(int length) {
		int array[] = new int[length];
		int min = -1000;
		int max = 1000;
		for(int i = 0; i < length; i++) {
			array[i] = (int)(Math.random() * ((max - min) + 1)) + min;
		}
		return array;
	}




	/*
	 * Utility function used to crosscheckk the stored List of ArrayLists
	 */
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
	

	/*
	 * File IO function
	 * Input: None
	 * Output: ArrayList<ArrayList<Integer>>
	 * Reads input text file line by line and stores the input lists in list of ArrayLists
	 */	
	private static ArrayList<ArrayList<Integer>> populateListOfInputs() {
		
		ArrayList<ArrayList<Integer>> listOflist = new ArrayList<ArrayList<Integer>>();
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);		
			
			String line;
			while ((line = br.readLine()) != null) {
				// Remove all spaces, '[' and ']'
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