package uz.pj.simple_trello.dto.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.pj.simple_trello.dto.base.Dto;
import uz.pj.simple_trello.entity.auth.AuthRole;

@Getter
@Setter
@ToString
public class AuthUserCreateDto implements Dto {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String conPassword;
    private AuthRole role;
    private Long roleId;

}
