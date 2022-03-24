package uz.pj.simple_trello.entity.project;

import lombok.Getter;
import lombok.Setter;
import uz.pj.simple_trello.entity.base.Auditable;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "project")
public class Project extends Auditable {

    @Column(name = "name")
    private String name;

    private String description;
    private String tz;
    private Long organizationId;

    @Column(name = "closed")
    private Boolean closed = false;

}