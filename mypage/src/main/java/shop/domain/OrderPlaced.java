package shop.domain;

import java.util.Date;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String itemId;
    private String customerId;
    private String address;
}
