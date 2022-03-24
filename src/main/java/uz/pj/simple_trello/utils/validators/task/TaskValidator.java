package uz.pj.simple_trello.utils.validators.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.pj.simple_trello.dto.task.TaskCreateDto;
import uz.pj.simple_trello.dto.task.TaskUpdateDto;
import uz.pj.simple_trello.exceptions.ValidationException;
import uz.pj.simple_trello.utils.BaseUtils;
import uz.pj.simple_trello.utils.validators.AbstractValidator;

@Component
public class TaskValidator extends AbstractValidator<
        TaskCreateDto,
        TaskUpdateDto,
        Long> {

    @Autowired
    protected TaskValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(TaskCreateDto taskCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(TaskUpdateDto cd) throws ValidationException {

    }
}
