package member.services;


import global.exceptions.ValidationException;
import global.validators.Validator;
import member.controllers.RequestJoin;
import member.validators.JoinValidator;

public class JoinService {
    // 구성으로 기능 확장
    private Validator<RequestJoin> validator;

    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }
    public void process(RequestJoin form) {
        validator.check(form);
    }
}
