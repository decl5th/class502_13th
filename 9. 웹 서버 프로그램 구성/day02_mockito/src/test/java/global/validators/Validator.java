package global.validators;

public interface Validator<T> {
    // 여러 대상을 검증
    // 입력 받는 데이터가 자료형이 다양 -> 제네릭 클래스로 확보
    void check(T form);
}
