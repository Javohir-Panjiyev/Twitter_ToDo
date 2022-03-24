package uz.pj.simple_trello.services.organization;

import uz.pj.simple_trello.criteria.GenericCriteria;
import uz.pj.simple_trello.dto.organization.OrganizationCreateDto;
import uz.pj.simple_trello.dto.organization.OrganizationDto;
import uz.pj.simple_trello.dto.organization.OrganizationUpdateDto;
import uz.pj.simple_trello.services.base.GenericCrudService;


public interface OrganizationService extends GenericCrudService<
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        GenericCriteria,
        Long> {
}
