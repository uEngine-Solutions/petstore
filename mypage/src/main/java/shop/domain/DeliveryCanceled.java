package shop.domain;

import java.util.Date;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long orderId;
}
