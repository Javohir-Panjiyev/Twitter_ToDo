package uz.pj.simple_trello.dto.project;

import lombok.*;
import uz.pj.simple_trello.dto.base.Dto;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCreateDto implements Dto {
    private String name;
    private String description;
    private String tz;

    private Long organizationId;


}
