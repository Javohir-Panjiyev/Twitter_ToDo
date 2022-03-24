package uz.pj.simple_trello.dto.project;

import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.dto.base.Dto;

@Setter
@Getter
public class ProjectColumnCreateDto implements Dto {
    private String name;
    private int position;
    private Long projectId;
}
