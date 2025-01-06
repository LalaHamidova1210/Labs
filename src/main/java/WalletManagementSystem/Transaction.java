package WalletManagementSystem;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private BigDecimal deposit;
    private BigDecimal withdraw;
    private BigDecimal transfer;
    private BigDecimal amount;
    private LocalDate date;
    private String origin;
    private Long walletId;

}
