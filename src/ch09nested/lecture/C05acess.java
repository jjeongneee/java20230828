//package ch09nested.lecture;
//
////import ch08extends.book.exercise.p12.C;
//
//import static com.sun.tools.classfile.AccessFlags.Kind.InnerClass;
//
//public class C05acess {
//    String name = "java";
//
//    class InnerClass {
//        String name = "spring";
//
//        void method() {
//            System.out.println(name);
//            System.out.println(this.name);
//            System.out.println(C05access.this.name);
//        }
//    }
//
//    public static void main(String[] args) {
//        C05access o2 = new C05access();
//        InnerClass o1 = o2.new InnerClass();
//        o1.method();
//    }
//
//    private static class C05access {
//    }
//}
