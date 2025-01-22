package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;
    private String status;

    public Orderplaced(OrderMgnt aggregate) {
        super(aggregate);
    }

    public Orderplaced() {
        super();
    }
}
//>>> DDD / Domain Event
