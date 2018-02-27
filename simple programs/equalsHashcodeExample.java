package justJava;

public class equalsHashcodeExample {
public static void main(String[] args) {
	
	equalsHashcodePojo bn,bn1,bn2;
	
	bn=new equalsHashcodePojo("raj",23);
	bn1=new equalsHashcodePojo("rajesh",22);
	bn2=new equalsHashcodePojo("raj",23);
	
	System.out.println(bn.hashCode()+" and "+bn2.hashCode());
	System.out.println(bn.equals(bn2));
	
	String name="lok";
	String name2=new String("lok");
	
	System.out.println("name "+name);
	System.out.println("name2 "+name2);
	
	System.out.println(name.equals(name2));
	System.out.println(name==name2);
 	
}
}
