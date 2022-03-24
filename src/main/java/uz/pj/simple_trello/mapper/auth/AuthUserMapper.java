package uz.pj.simple_trello.mapper.auth;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.auth.AuthUserCreateDto;
import uz.pj.simple_trello.dto.auth.AuthUserDto;
import uz.pj.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.pj.simple_trello.entity.auth.AuthUser;
import uz.pj.simple_trello.mapper.base.BaseMapper;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper<AuthUser,
        AuthUserDto,
        AuthUserCreateDto,
        AuthUserUpdateDto>,
        uz.pj.simple_trello.mapper.base.Mapper {

    @Override
    AuthUserDto toDto(AuthUser authUser);

    @Override
    List<AuthUserDto> toDto(List<AuthUser> e);

    @Override
    AuthUser fromCreateDto(AuthUserCreateDto dto);

    @Override
    AuthUser fromUpdateDto(AuthUserUpdateDto authUserUpdateDto);
}
