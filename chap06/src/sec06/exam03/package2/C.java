package sec06.exam03.package2;

import sec06.exam03.package1.*;
//import sec06.exam03.package1.B;
//import sec06.exam03.package1.A; //패키지가 달라 A에 접근 불가

public class C {
//	A testA = new A(); //package1을 모두 import 해도 사용불가
	B testB = new B(); //import 후 타 패키지 사용 가능
}
