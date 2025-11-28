class A {
    void m() {
        System.out.println("A");
    }
}

class B extends A {
    void m() {
        System.out.println("B");
    }
}

public class JavaStudy {
    public static void main(String[] args) {
        A a = (B)(new A());
        ((B)a).m();
        ((A)a).m();
        A b = (A)a;
        b.m();
    }
}