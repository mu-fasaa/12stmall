package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Soldout extends AbstractEvent {

    private Long id;

    public Soldout(Inventory aggregate) {
        super(aggregate);
    }

    public Soldout() {
        super();
    }
}
//>>> DDD / Domain Event
