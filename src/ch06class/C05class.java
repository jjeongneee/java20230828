package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 = new MyClass05();

        System.out.println("o1의 참조값 = " + System.identityHashCode(o1));

        o1.age = 30; // 인스턴스로 접근
        o1.model = "java";  // 권장하지 않음.(클래스에 관한 값이나 인스턴스로 접근하는 것 처럼 보임)
        MyClass05.model = "spring"; // 권장(static이므로 class로 호출!!)

        System.out.println("o1.age = " + o1.age);   // 30
        System.out.println("o2.age = " + o2.age);   // 0
        System.out.println("o1.model = " + o1.model);   // "spring"
        System.out.println("o2.model = " + o2.model);   // "spring"

    }
}

class MyClass05{
    // 속성 fields
    int age;    // instance field
    // static이 있으면 클래스에 관한 값(없으면 인스턴스에 관한 값)
    // static field, class field, 정적필드
    static String model;

    // 기능
}
