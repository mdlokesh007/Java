package sorting;

public class ObjectModel implements Comparable<ObjectModel> {

	public ObjectModel(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ObjectModel [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(ObjectModel o) {
		//return o.age-this.age;
		return this.age-o.age;

	}
}
