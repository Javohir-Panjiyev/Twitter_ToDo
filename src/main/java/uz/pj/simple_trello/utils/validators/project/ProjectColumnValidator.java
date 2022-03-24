package uz.pj.simple_trello.utils.validators.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.project.ProjectColumnCreateDto;
import uz.pj.simple_trello.dto.project.ProjectColumnUpdateDto;
import uz.pj.simple_trello.exceptions.ValidationException;
import uz.pj.simple_trello.utils.BaseUtils;
import uz.pj.simple_trello.utils.validators.AbstractValidator;

@Component
public class ProjectColumnValidator extends AbstractValidator<ProjectColumnCreateDto,
        ProjectColumnUpdateDto, Long> {


    @Autowired
    protected ProjectColumnValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ProjectColumnCreateDto projectColumnCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ProjectColumnUpdateDto cd) throws ValidationException {

    }
}
