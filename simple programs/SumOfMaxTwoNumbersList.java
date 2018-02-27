package justJava;

import java.util.ArrayList;
import java.util.Collections;
public class SumOfMaxTwoNumbersList {
	private static int getSumOfMaxTwoNumbersList(ArrayList<Integer> list){
		int firstlargeNumber = 0;
		int secondLargenumber = 0;
		//WithOut Any defaultMethods
		for(int i : list){
			if(firstlargeNumber < i){
				secondLargenumber = firstlargeNumber;
				firstlargeNumber = i;
			}else if (secondLargenumber < i) {
				secondLargenumber = i;
			}
		}		
		return firstlargeNumber + secondLargenumber;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(2);
		list.add(12);
		list.add(4);
		list.add(18);
		System.out.println(SumOfMaxTwoNumbersList.getSumOfMaxTwoNumbersList(list));
		//with default methods
		Collections.sort(list);
		System.out.println(list.get(list.size()-1)+list.get(list.size()-2));
	}
}
