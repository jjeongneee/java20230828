package ch08extends.lecture.package2;

import ch08extends.lecture.package1.A;

public class D extends A {
    private A a;

    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}