package sec02.exam05;

//public class Example {
//	public static void main(String[] args) {
//		ImplementationC impl = new ImplementationC();
//		
//		InterfaceA ia = impl;
//		ia.methodA();
//		System.out.println();
//		
//		InterfaceB ib = impl;
//		ib.methodB();
//		System.out.println();
//		
//		InterfaceC ic = impl;
//		ic.methodA();
//		ic.methodB();
//		ic.methodC();
//		System.out.println();
//		
//		ic.test();
//	}
//}

interface A {
    default void hello() {
        System.out.println("A");
    }
}

interface B {
    default void hello() {
        System.out.println("B");
    }
}

class C implements A, B {
    public void hello() {
    	A.super.hello();
    }
}

public class Example {
    public static void main(String[] args) {
        C c = new C();
        c.hello();
    }
}

