package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon_Banana+Mango" ; // #,_+ -> 토큰이 됨

        // 두번째 매개변수로 토큰을 직접 사용
        StringTokenizer st = new StringTokenizer(fruits, "#<_+");

        while (st.hasMoreElements()){
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
