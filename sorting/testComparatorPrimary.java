package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testComparatorPrimary {

	public static void main(String[] args) {
		List<String> arrayFirstNamesAsArray = Arrays.asList("Fat","Buddy","Sticky");
	//	Collections.sort(arrayFirstNamesAsArray); //default natural sorting order
		
		//customized sorting order 
		Collections.sort(arrayFirstNamesAsArray,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
		for(String temp:arrayFirstNamesAsArray){
			System.out.println(temp);
		}
		
		
		
	}

}
