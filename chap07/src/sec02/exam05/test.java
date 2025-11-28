package sec02.exam05;

public class test {
	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new C();
		
		B b3 = new B(); 
		
		A e1 = new F();
		
		b1 = (A)e1;
		boolean result = e1 instanceof B;
		System.out.println(result);
//		b3 = (B)e1; //예외 발생
	}
}
class A {
	
}
class B extends A{
}
class C extends B {
}
class D extends C {
}


class E extends A {
}
class F extends E {
	
}
