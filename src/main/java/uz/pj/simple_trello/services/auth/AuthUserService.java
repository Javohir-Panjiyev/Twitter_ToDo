package uz.pj.simple_trello.services.auth;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.auth.AuthUserCreateDto;
import uz.pj.simple_trello.dto.auth.AuthUserDto;
import uz.pj.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.pj.simple_trello.dto.auth.LoginDto;
import uz.pj.simple_trello.services.base.GenericCrudService;

public interface AuthUserService extends GenericCrudService<
        AuthUserDto,
        AuthUserCreateDto,
        AuthUserUpdateDto,
        GenericCriteria,
        Long
        > {
    void login(LoginDto dto);
}
