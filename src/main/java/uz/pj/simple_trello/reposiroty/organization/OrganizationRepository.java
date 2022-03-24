package uz.pj.simple_trello.reposiroty.organization;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pj.simple_trello.entity.organization.Organization;
import uz.pj.simple_trello.reposiroty.base.AbstractRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {

}
