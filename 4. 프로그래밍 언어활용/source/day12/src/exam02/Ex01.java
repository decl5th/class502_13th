package exam02;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "사용자01"); // 키와 값형태의 구조
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.putIfAbsent("user03", "(수정)사용자03");


        HashMap<String, String> members2 = new HashMap<>();
        members2.put("user04", "사용자명04");
        members2.put("user05", "사용자05");

        // putall를 통해 통합 가능 but 순서 보장 X
        members.putAll(members2);
        //members.put("user05", "(수정)사용자05");
        members.replace("user05", "(수정)사용자05");
        members.remove("user05");


        String userNm = members.get("user03");
        System.out.println(userNm);

        String userNm2 = members.get("user06");
        System.out.println(userNm2);

        String userNm3 = members.getOrDefault("user07", "없음");
        System.out.println(userNm3);

        System.out.println(members);  // members.toString()
    }
}
