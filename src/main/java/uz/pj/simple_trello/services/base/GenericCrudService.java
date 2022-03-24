package uz.pj.simple_trello.services.base;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.base.Dto;
import uz.pj.simple_trello.dto.base.GenericDto;

import java.io.Serializable;

/**
 * @param <D>  -> Dto
 * @param <CD> -> Create Dto
 * @param <UD> -> Update Dto
 * @param <K>  -> class that defines the primary key for your pojo class
 * @param <C>  -> Criteria (For Filtering Request)
 */
public interface GenericCrudService<
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable> extends GenericService<D, C, K> {

    K create(CD createDto);

    void delete(K id);

    void update(UD updateDto);

}
