package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testComparable {

	public static void main(String[] args) {
		
		//List<String> arrayFirstNamesAsArray = Arrays.asList("Fat","Buddy","Sticky");
		List<pojoComparable> list=Arrays.asList(
				new pojoComparable(1,"lok"),
				new pojoComparable(2,"raj"),
				new pojoComparable(5,"kish"),
				new pojoComparable(3,"naresh"),
				new pojoComparable(9,"ram")
				);
	
		Collections.sort(list);
	
		for(pojoComparable temp:list){
			System.out.println(temp);
		}
	
	}

}
