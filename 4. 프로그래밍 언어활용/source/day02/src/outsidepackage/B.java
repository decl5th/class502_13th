package outsidepackage;

import samepackage.A;

public class B extends A { // extends를 통해 상속을 명시
    public void print() {
        protectedNum = 100;
        System.out.println(protectedNum);

    }



}
