package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.OrderApplication;
import untitled.domain.OrderModified;
import untitled.domain.Orderplaced;

@Entity
@Table(name = "OrderMgnt_table")
@Data
//<<< DDD / Aggregate Root
public class OrderMgnt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String productName;

    private Long productId;

    private Integer qty;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();

        OrderModified orderModified = new OrderModified(this);
        orderModified.publishAfterCommit();
    }

    public static OrderMgntRepository repository() {
        OrderMgntRepository orderMgntRepository = OrderApplication.applicationContext.getBean(
            OrderMgntRepository.class
        );
        return orderMgntRepository;
    }
}
//>>> DDD / Aggregate Root
