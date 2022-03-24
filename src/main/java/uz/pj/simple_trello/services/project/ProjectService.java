package uz.pj.simple_trello.services.project;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.project.ProjectCreateDto;
import uz.pj.simple_trello.dto.project.ProjectDto;
import uz.pj.simple_trello.dto.project.ProjectUpdateDto;
import uz.pj.simple_trello.services.base.GenericCrudService;

import java.util.List;

public interface ProjectService extends GenericCrudService<
        ProjectDto,
        ProjectCreateDto,
        ProjectUpdateDto,
        GenericCriteria,
        Long> {

    List<ProjectDto> getAllProjects(Long id);
}