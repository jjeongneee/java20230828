package ch12api.lecture;

public class C34annotation {
    @MyAnnotation34(name = "seoul", address = "jeju")
    int field;
}

@interface MyAnnotation34 {
    // elements (attributes)

    // value element는 사용시 생략 가능
    String name();
    String address();
}