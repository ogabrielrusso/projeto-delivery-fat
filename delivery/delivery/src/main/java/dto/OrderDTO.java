package dto;
import lombok.Data;
import java.math.BigDecimal;
import time.LocalDateTime;


@Data
public class OrderDTO {
     private Long id;
        private String customerName;
        private BigDecimal totalAmount;
        private LocalDateTime createdAt;
        
           


    
}
