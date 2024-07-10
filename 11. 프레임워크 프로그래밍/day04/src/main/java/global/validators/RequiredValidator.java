package global.validators;

public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e) {
        if (str == null || str.isEmpty()) {
            throw e;
        }
    }
}
