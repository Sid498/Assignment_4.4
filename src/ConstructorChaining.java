class A {
	A() {
		System.out.println("Constructor of Class A");
	}
}

class B extends A {
	B() {
		/*super() must be added to the first
		line of constructor otherwise it would
		throw compilation error: 
		 Constructor call must be the first statement 
		in a constructor*/
		super();
		System.out.println("Constructor of Class B");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		B b = new B();
	}

}
