package uz.pj.simple_trello.dto.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.GenericDto;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder(builderMethodName = "childBuilder")
public class TaskUpdateDto extends GenericDto {

    private String name;
    private String description;

    private LocalDateTime deadline;

}
