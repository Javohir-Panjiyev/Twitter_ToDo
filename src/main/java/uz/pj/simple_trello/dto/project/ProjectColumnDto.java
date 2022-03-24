package uz.pj.simple_trello.dto.project;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder(builderMethodName = "childBuilder")
public class ProjectColumnDto extends GenericDto {
    private String name;
    private Long projectId;
    private LocalDateTime deadline;
    private Long id;

}
