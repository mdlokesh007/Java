package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testComparator {

	public static void main(String[] args) {
	
			//List<String> arrayFirstNamesAsArray = Arrays.asList("Fat","Buddy","Sticky");
				List<pojoComparator> list=Arrays.asList(
						new pojoComparator(1,"lok"),
						new pojoComparator(2,"raj"),
						new pojoComparator(5,"kish"),
						new pojoComparator(3,"naresh"),
						new pojoComparator(9,"ram")
						);
			
				Collections.sort(list,new Comparator<pojoComparator>(){

					@Override
					public int compare(pojoComparator o1, pojoComparator o2) {
						// TODO Auto-generated method stub
						//return o1.getId()-o2.getId();
						//return o1.getId()-o2.getId(); //sort ascending order
						//return -o1.getId()+o2.getId(); //sort descending order
						//return o1.getName().compareTo(o2.getName()); //ascending order
						return o2.getName().compareTo(o1.getName()); //descending order

					}

					
				});
			
				for(pojoComparator temp:list){
					System.out.println(temp);
				}
		
	}
}
