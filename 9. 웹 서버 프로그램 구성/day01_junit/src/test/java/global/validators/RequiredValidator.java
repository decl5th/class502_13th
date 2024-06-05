package global.validators;

public interface RequiredValidator {
    // 유연성 확보 => 필요할 때만 사용하기 위함
    default void checkRequired(String field, RuntimeException e) {
        if (field == null || field.isBlank()) {
            throw e;
        }
    }

    default void checkTrue(boolean result, RuntimeException e) {
        if (!result) {
            throw e;
        }
    }
}
