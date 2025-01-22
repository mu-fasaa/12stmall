package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "SearchProdcut_table")
@Data
public class SearchProdcut {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
