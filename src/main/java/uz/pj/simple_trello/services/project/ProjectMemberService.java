package uz.pj.simple_trello.services.project;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.project.ProjectMemberCreateDto;
import uz.pj.simple_trello.dto.project.ProjectMemberDto;
import uz.pj.simple_trello.dto.project.ProjectMemberUpdateDto;
import uz.pj.simple_trello.services.base.GenericCrudService;

public interface ProjectMemberService extends GenericCrudService<
        ProjectMemberDto,
        ProjectMemberCreateDto,
        ProjectMemberUpdateDto,
        GenericCriteria,
        Long> {
}
