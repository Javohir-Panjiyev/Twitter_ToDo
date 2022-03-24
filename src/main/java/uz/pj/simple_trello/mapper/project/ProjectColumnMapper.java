package uz.pj.simple_trello.mapper.project;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.project.ProjectColumnCreateDto;
import uz.pj.simple_trello.dto.project.ProjectColumnDto;
import uz.pj.simple_trello.dto.project.ProjectColumnUpdateDto;
import uz.pj.simple_trello.entity.project.ProjectColumn;
import uz.pj.simple_trello.mapper.base.BaseMapper;

import java.util.List;

@Component(value = "projectMemberMapper")
@Mapper(componentModel = "spring")
public interface ProjectColumnMapper extends BaseMapper<
        ProjectColumn,
        ProjectColumnDto,
        ProjectColumnCreateDto,
        ProjectColumnUpdateDto
        > , uz.pj.simple_trello.mapper.base.Mapper {

    @Override
    ProjectColumnDto toDto(ProjectColumn projectColumn);

    @Override
    List<ProjectColumnDto> toDto(List<ProjectColumn> e);

    @Override
    ProjectColumn fromCreateDto(ProjectColumnCreateDto projectColumnCreateDto);

    @Override
    ProjectColumn fromUpdateDto(ProjectColumnUpdateDto projectColumnUpdateDto);

}
