package exam04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class cls1 = Person02.class;

        Field[] fields = cls1.getFields();
        Method[] methods = cls1.getMethods();
        Constructor[] constructors = cls1.getConstructors();

        System.out.println("--------- Fields ------------");
        for (Field field : fields) {
            System.out.println(field); //field.toString() 기본적으로 정의되어 있다
        }

        System.out.println("-------- Constructor -----------");
        for (Constructor constructor : constructors) {
            System.out.println(constructor); // constructor.toString() 기본적으로 정의되어 있다
        }

        System.out.println("----------- Methods -----------");
        for (Method method : methods) {
            System.out.println(method); // method.toString() 기본적 재정의
        }

        Person02 p1 = new Person02();
        Class cls2 = p1.getClass(); // 클래스 내부에서 사용할 목적
        System.out.println("------------ Class ------------");
        System.out.println(cls2.getName());
    }
}
