package methodWithNonPrimitiveReturnType;

public class Voting {

	int age;
	String name;
	public Voting register() {
		Voting v1=new Voting();
		v1.age=21;
		v1.name="Oggy";
		return v1;
	}
	public static void main(String[] args) {
		Voting obj=new Voting();
		Voting v=obj.register();
		System.out.println("Age: "+v.age);
		System.out.println("Name: "+v.name);

	}

}
