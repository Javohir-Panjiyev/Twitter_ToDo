package uz.pj.simple_trello.dto.base;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericDto implements Dto {
    private Long id;
}
