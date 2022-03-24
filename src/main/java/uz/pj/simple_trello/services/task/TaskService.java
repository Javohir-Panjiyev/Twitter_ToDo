package uz.pj.simple_trello.services.task;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.task.TaskCreateDto;
import uz.pj.simple_trello.dto.task.TaskDto;
import uz.pj.simple_trello.dto.task.TaskUpdateDto;
import uz.pj.simple_trello.entity.task.Task;
import uz.pj.simple_trello.services.base.GenericCrudService;

import java.util.List;

public interface TaskService extends GenericCrudService<
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long
        > {
    List<Task> getAllTasks(Long id);
}
