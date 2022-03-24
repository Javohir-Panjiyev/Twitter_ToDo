package uz.pj.simple_trello.dto.project;

import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

@Setter
@Getter
public class ProjectUpdateDto extends GenericDto {
    private String name;

}
