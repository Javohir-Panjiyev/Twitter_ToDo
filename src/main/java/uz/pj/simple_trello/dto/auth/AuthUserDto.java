package uz.pj.simple_trello.dto.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

@Setter
@Getter
@Builder(builderMethodName = "childBuilder")
public class AuthUserDto extends GenericDto {

    private String name;
}
