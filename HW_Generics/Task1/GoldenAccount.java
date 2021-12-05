import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GoldenAccount extends Account {
    public GoldenAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    public void credit(BigDecimal balance) {
        this.balance = this.balance.add(balance);
        operations.add(new Operation("Credit", balance, LocalDateTime.now()));
    }

    public void debit(BigDecimal balance) {
        BigDecimal newBalance = this.balance.subtract(balance);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("balance can not be negative");
        }
        newBalance = newBalance.add(new BigDecimal("100.00"));
        this.balance = newBalance;
        operations.add(new Operation("Debit", balance, LocalDateTime.now()));
    }
}
© 2021 GitHub, I