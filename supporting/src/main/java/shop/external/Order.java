package shop.external;

import java.util.Date;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private String itemId;
    private String customerId;
    private String address;
    // keep

}
