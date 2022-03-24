package uz.pj.simple_trello.utils.validators.auth;

import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.auth.AuthUserCreateDto;
import uz.pj.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.pj.simple_trello.exceptions.ValidationException;
import uz.pj.simple_trello.utils.BaseUtils;
import uz.pj.simple_trello.utils.validators.AbstractValidator;

@Component
public class AuthUserValidator extends AbstractValidator<AuthUserCreateDto, AuthUserUpdateDto, Long> {
    protected AuthUserValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(AuthUserCreateDto dto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(AuthUserUpdateDto cd) throws ValidationException {

    }
}
