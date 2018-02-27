package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ObjectSortingExample {

	private static final Comparator Mycomparator = null;

	public static void main(String[] args) {
	
		ObjectModel obj1=new ObjectModel("king",25);
		ObjectModel obj2=new ObjectModel("rose",32);
		ObjectModel obj3=new ObjectModel("puma",27);
		ObjectModel obj4=new ObjectModel("babu",16);
		ObjectModel obj5=new ObjectModel("naidu",29);
		ObjectModel obj6=new ObjectModel("kish",30);
		
		//TreeSet<ObjectModel> arrList=new TreeSet<ObjectModel>();
		ArrayList<ObjectModel> arrList=new ArrayList<ObjectModel>();
		arrList.add(obj1);
		arrList.add(obj2);
		arrList.add(obj3);
		arrList.add(obj4);
		arrList.add(obj5);
		arrList.add(obj6);
		
		Collections.sort(arrList); //sort using comparable
		//Collections.sort(arrList,new Mycomparator()); //sort using comparator
		for(ObjectModel temp:arrList){
		System.out.println(temp);
		}
		
	}

}

class Mycomparator implements Comparator<ObjectModel>{

	@Override
	public int compare(ObjectModel o1, ObjectModel o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}
 