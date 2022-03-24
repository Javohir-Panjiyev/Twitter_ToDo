package uz.pj.simple_trello.reposiroty.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import uz.pj.simple_trello.entity.project.Project;
import uz.pj.simple_trello.reposiroty.base.AbstractRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {

    @Query("select u from Project u where u.organizationId=:id")
    List<Project> findPro(@Param("id") Long id);
}
