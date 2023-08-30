package ch07extends.book.extra6;

public class Child extends Parent{
    public int studentNo;

    public Child(String name, int StudentNo) {
        // super();는 오류(name만 있으므로!) 상속받는걸 ()안에 명시적으로 작성
        super(name);
        // this.name 지우기!
//        this.name = name;
        this.studentNo = studentNo;
    }
}
