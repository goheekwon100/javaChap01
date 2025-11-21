package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		child.method3();

		Child newChild = (Child)parent;
		((Child)parent).method3();
		
		//하나의 타입으로 여러 객체를 모두 다룰수 있습니다.
	}
}
