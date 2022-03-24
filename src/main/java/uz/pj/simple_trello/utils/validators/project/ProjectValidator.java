package uz.pj.simple_trello.utils.validators.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.project.ProjectCreateDto;
import uz.pj.simple_trello.dto.project.ProjectUpdateDto;
import uz.pj.simple_trello.exceptions.ValidationException;
import uz.pj.simple_trello.utils.BaseUtils;
import uz.pj.simple_trello.utils.validators.AbstractValidator;


@Component
public class ProjectValidator extends AbstractValidator<ProjectCreateDto, ProjectUpdateDto,Long> {

    @Autowired
    protected ProjectValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectCreateDto projectCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectUpdateDto cd) throws ValidationException {

    }
}
