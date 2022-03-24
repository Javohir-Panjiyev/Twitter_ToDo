package uz.pj.simple_trello.services.base;

import uz.pj.simple_trello.mapper.base.Mapper;
import uz.pj.simple_trello.reposiroty.base.AbstractRepository;
import uz.pj.simple_trello.utils.BaseUtils;
import uz.pj.simple_trello.utils.validators.Validator;


/**
 * @param <R> repository
 * @param <M>
 * @param <V>
 */
public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper,
        V extends Validator> {
    protected final R repository;
    protected final M mapper;
    protected final V validator;
    protected final BaseUtils baseUtils;

    protected AbstractService(R repository, M mapper, V validator, BaseUtils baseUtils) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
        this.baseUtils = baseUtils;
    }
}
