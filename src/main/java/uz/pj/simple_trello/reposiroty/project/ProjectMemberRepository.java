package uz.pj.simple_trello.reposiroty.project;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pj.simple_trello.entity.project.ProjectMember;
import uz.pj.simple_trello.reposiroty.base.AbstractRepository;


public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long>, AbstractRepository {
}
