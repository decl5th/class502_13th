package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        if ( ad instanceof C) {
            C c = (C) ad; // 성립 안됨 -> ad는 A에서 별개로 상속받은 D의 객체이기에 C의 속해있지 않음
        }

        if ( ac instanceof C) {
            C cc = (C) ac;
            System.out.println(cc.numC);
        }
       //  C c = ad; -> 쌩으로는 성립 안됨
    }
}
