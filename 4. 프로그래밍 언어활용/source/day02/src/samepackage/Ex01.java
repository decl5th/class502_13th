package samepackage;

import outsidepackage.B;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A(); //
        B b = new B();
        System.out.println(b.protectedNum);

    }
}
