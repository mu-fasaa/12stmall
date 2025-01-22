package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderModified extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;
    private String status;
}
