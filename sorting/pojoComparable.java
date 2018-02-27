package sorting;

public class pojoComparable implements Comparable<pojoComparable> {

	
	public pojoComparable(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private Integer id;
	private String name;
	
	
	
	@Override
	public int compareTo(pojoComparable o) {
		// TODO Auto-generated method stub
		//return this.id-o.id; //sort ascending order
		//return -this.id+o.id; //sort descending order
		//return this.name.compareTo(o.name); //ascending order
		return o.name.compareTo(this.name); //descending order

	}



	@Override
	public String toString() {
		return "pojoComparable [id=" + id + ", name=" + name + "]";
	}

}
