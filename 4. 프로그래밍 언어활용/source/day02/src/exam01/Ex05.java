package exam01;

import java.lang.reflect.Method;

public class Ex05 {
    public static void main(String[] args) {
        Class cls = Student.class; // class cls -> 클래스의 정보가 담겨있는 객체 정적 변수; Student의 정보 확인

        Method[] methods = cls.getMethods(); // clsss
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
